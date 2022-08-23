package com.sunglowsys.string;

public class EquelsMethod {
    public static void main(String[] args) {
        String s1 = new String("aBC");
        String s2 = new String("abc");
        String s7 = new String("Welcome");

        String s3 = "java";                     //use == operator and .equals method and compareTo method create a  string objet
        String s4 = "java";
        String s5 = "Welcome";
        String s6 = "Welcome";

        System.out.println(s1==s2);//false
        System.out.println(s2==s4);//false
        System.out.println(s3==s4);//true
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//false
        System.out.println(s3.equals(s4));//true
        System.out.println(s1.equals(s5));//false
        System.out.println(s5.equals(s6));//true
        System.out.println(s1.compareTo(s2));//-32
        System.out.println(s5.equals(s7));//true
        System.out.println(s5==s7);//false
    }
}
