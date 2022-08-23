package com.sunglowsys.string;

public class StringImmutable {
    public static void main(String[] args) {

        String s = new String("Welcome");

        s.concat("java");                   //once we are create string object that can not be chane and modifire object

        s=s.concat("hello");             //can not be change string object but you are try to change the value so that create a new object




        System.out.println(s);


    }
}
