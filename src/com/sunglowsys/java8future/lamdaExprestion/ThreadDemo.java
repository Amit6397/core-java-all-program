package com.sunglowsys.java8future.lamdaExprestion;

public class ThreadDemo {
    Runnable thread1 = ()->{
        for (int i= 1; i<=10; i++){
            System.out.println("print value=:"+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    };

    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.thread1.run();
    }
}
