package com.sunglowsys.string.stringmethod;

import java.io.InterruptedIOException;

public class JoinMethod extends Thread {
    static Thread mainthread;

    public void run(){


        try{
            mainthread.join();
            for (int i=1; i<=5; i++){

                System.out.println("therad 0 work:="+i);
                sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        mainthread = Thread.currentThread();
        JoinMethod t = new JoinMethod();
        t.start();


                            /*
                                if a thread want to wait for another thread to complete task than should be use join() method
                                and join method use for than throws exception InterruptedException ok
                             */


        try{
            for (int i=1; i<=5; i++){
                System.out.println("main Thread work:="+i);
                sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
