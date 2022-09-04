package com.bridgelab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
        static Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.]+$");
        public static void main(String[] args) {
            // Valid  1abb23a ,  bcc ,1aaa
            // Invalid  111 ,1a1aab , aa11
            Matcher matcher = pattern.matcher("abc+100@gmail.com");
            if(matcher.matches())
                System.out.println(true);
            else
                System.out.println(false);
        }
    }

