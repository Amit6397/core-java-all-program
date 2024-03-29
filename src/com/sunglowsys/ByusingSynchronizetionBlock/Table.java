package com.sunglowsys.ByusingSynchronizetionBlock;

public class Table {
    synchronized void printTable(int n){
        synchronized (this){
            for (int i=1;i<10;i++){
                System.out.println(n*i);
            }
            try {
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }


    }
}
class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(1);
    }
}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}
class MyThread3 extends Thread{
    Table t;
    MyThread3(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class MyThread4 extends Thread{
    Table t;
    MyThread4(Table t){
        this.t=t;
    }
    public  void run(){
        t.printTable(1000);
    }
}
class TestSynchronizationBlock{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread3 t3 = new MyThread3(obj);
        MyThread4 t4 = new MyThread4(obj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}