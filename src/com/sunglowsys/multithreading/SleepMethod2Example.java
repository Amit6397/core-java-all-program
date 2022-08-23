package com.sunglowsys.multithreading;

public class SleepMethod2Example extends Thread{
    public void run(int i){
        System.out.println(i);

    }
    public void call(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {


        SleepMethod2Example t = new SleepMethod2Example();
       t.call("amit");
       t.run(1);
        t.start();


        SleepMethod2Example t1 = new SleepMethod2Example();
        t1.call("sumit");
        t1.run(2);
        t1.start();

    }
}
