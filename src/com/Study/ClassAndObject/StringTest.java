package com.Study.ClassAndObject;

import java.io.*;

public class StringTest {
    public static void main(String args[]) {
        String Str = new String("Welcome-to-Runoob.com");

        System.out.println("The value is :" );
        for (String retval: Str.split("-", 2)){
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("The value is :" );
        for (String retval: Str.split("-", 3)){
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("The value is :" );
        for (String retval: Str.split("-", 0)){
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("The value is :" );
        for (String retval: Str.split("-")){
            System.out.println(retval);
        }
    }

}
