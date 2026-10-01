package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            User user = new User("Alice","alice@example.com");
            session.persist(user);
            transaction.commit();
            System.out.println("User saved with ID: " + user.getId());

            // 7. Read the user back out using their ID (Hibernate generates SELECT SQL)
            User fetchedUser = session.get(User.class, user.getId());
            System.out.println("Fetched User Name: " + fetchedUser.getName());
        }
        catch(Exception e){
            if(transaction != null)
                transaction.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
