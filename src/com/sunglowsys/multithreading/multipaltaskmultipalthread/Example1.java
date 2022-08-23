package com.sunglowsys.multithreading.multipaltaskmultipalthread;

public class Example1 extends Thread{

    @Override
    public void run(){

        try {
            for (int i=1; i<10; i++){
                System.out.println("print Example one ................."+i+" ");
                Thread.sleep(1000);

                //System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Example2 extends Thread {
    public void run(){

        try {


            for (int i=1; i<10; i++){
                System.out.println("print Example two ................."+i+" ");


                Thread.sleep(1000);

                //System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
class Example3 extends Thread{
    public void run(){
        System.out.println("thord task ........");
    }
}
class Test {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.start();
        //Example1 e11 = new Example1();
        //e11.start();

        Example2 e2 = new Example2();
        e2.start();

        Example3 e3 = new Example3();
        e3.start();
    }
}
                /*
                 multipale task create multipale thread
                 */