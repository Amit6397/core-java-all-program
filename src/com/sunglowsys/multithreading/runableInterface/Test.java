package com.sunglowsys.multithreading.runableInterface;

public class Test implements Runnable {

    @Override
    public void run() {
        try {
            for (int i= 1; i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);

            }
        }catch (Exception e){
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        Test t = new Test();
        Thread d = new Thread(t);
        d.start();
    }
}