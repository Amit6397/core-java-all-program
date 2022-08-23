package com.sunglowsys.java8future.lamdaExprestion;

public interface StringLamda {
    int getLength(String str);

    public static void main(String[] args) {
        StringLamda lamda = (str)->str.length();
        //
        System.out.println(lamda.getLength("amit"));

    }
}

                //string length use by lamda