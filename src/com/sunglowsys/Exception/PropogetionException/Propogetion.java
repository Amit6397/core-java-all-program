package com.sunglowsys.Exception.PropogetionException;

public class Propogetion {

    public void m1(){
        m2();
        System.out.println("m1");
    }
    void m2(){
        m3();
        System.out.println("m2");
    }
    void m3(){

        System.out.println("m3");
    }

    public static void main(String[] args) {
        Propogetion p = new Propogetion();
        p.m1();

    }
}
