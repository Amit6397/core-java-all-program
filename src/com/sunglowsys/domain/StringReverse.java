package com.sunglowsys.domain;

public class StringReverse {
    public static void main(String[] args) {

        String name = "sunglowsys";
        int length = name.length();
        String c = "";

        for (int i = length-1; i >= 0; i--) {
            c= c+name.charAt(i);

        }
        System.out.println(c);

    }
}
