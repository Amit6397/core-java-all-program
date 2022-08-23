package com.sunglowsys.multithreading;

public class JoinMethod extends Thread{

    public void run(){
        try{

            for(int i=1; i<=5; i++){
                System.out.println("therad 0:="+i);
                sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JoinMethod j = new JoinMethod();
        j.start();

        try {
                j.join();
            for (int i=1; i<=5; i++){

                System.out.println("main therad:="+i);
                sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
