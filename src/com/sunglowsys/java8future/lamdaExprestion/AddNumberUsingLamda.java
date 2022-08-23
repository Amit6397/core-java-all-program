package com.sunglowsys.java8future.lamdaExprestion;
@FunctionalInterface
public interface AddNumberUsingLamda {
    int sum(int a , int b);


    public static void main(String[] args) {
        AddNumberUsingLamda lamda = ( a ,  b )->a+b;

        System.out.println(lamda.sum(2,6));

    }
}
