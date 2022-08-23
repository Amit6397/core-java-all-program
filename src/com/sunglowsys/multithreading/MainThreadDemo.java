package com.sunglowsys.multithreading;

public class MainThreadDemo {
    public static void main(String[] args) {

        //This is a main thread

        System.out.println("Hello");
       // System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Test");
        System.out.println(10/0);
       // System.out.println("new thread" +" "+Thread.currentThread().getName());

        //we are created main thread name by using Thread.currentThread().setName();


    }
}
