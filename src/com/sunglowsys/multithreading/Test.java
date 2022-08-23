package com.sunglowsys.multithreading;

public class Test extends Thread{

    public void run(){
        Thread.currentThread().setName("DEmo");
        System.out.println("Thread task"+" :"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("hello"+" :"+Thread.currentThread().getName());

        Test t = new Test();
      // t.setName("Amit");
        t.start();



    }
}
