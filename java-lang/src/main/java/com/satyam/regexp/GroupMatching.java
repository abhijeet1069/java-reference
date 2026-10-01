package com.satyam.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMatching {

    static void match1(){
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher("My age is 25");
        if(m.find()){
            System.out.println(m.group()); // 25
            System.out.println(m.group(1)); // 25
           // System.out.println(m.group(2)); //exception
        }
    }

    public static void main(String[] args) {
        match1();

    }
}
