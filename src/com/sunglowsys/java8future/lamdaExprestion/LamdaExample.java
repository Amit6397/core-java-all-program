package com.sunglowsys.java8future.lamdaExprestion;
@FunctionalInterface
public interface  LamdaExample {
    public abstract void sayHello(String name);

    public static void main(String[] args) {
        LamdaExample lamdaExample = (name)->
            System.out.println(name);
        lamdaExample.sayHello("amit");


        LamdaExample a = (name)->
            System.out.println(name);
            a.sayHello("kashyap");




    }
}


