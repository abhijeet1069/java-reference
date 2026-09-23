package com.learn.assertions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExample {

    @Test
    void basic_assertions(){
        assertEquals(10,5+5);
        assertNotEquals(10,5+4);

        assertTrue(10>5);
        assertFalse(10<5);

        String name = "Abhijeet";
        assertNotNull(name);

        assertNull(null);

    }

    @Test
    void assert_same_object(){
        List<String> list = new ArrayList<>();
        List<String> sameReference = list;

        //assert if both refer to same object
        assertSame(list,sameReference);
        assertNotSame(list, new ArrayList<>());
    }

    @Test
    void assert_all(){
        String name = "Abhijeet";
        int age = 25;

        assertAll(
                ()->assertEquals("Abhijeet",name),
                ()->assertNotNull(name),
                ()->assertTrue(age>18),
                ()->assertFalse(age<18)
        );
    }

    @Test
    void assert_exception(){
        Exception exception =  assertThrows(IllegalArgumentException.class,
                ()->{
                    throw new IllegalArgumentException("Age cannot be negative");
                });
        assertEquals("Age cannot be negative",exception.getMessage());
        assertDoesNotThrow(()->{
            int result = 10/2;
        });
    }
}
