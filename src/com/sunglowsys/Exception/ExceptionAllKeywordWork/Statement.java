package com.sunglowsys.Exception.ExceptionAllKeywordWork;

public class Statement {
    public static void main(String[] args) {
        System.out.println("statement...1");
        System.out.println("statement...2");
        try {

            System.out.println("statement...3");
            System.out.println(10/0);
            System.out.println("statement...5");

        }catch (Exception e){
            System.out.println("statement..6");
            //System.out.println;

        }finally {
            System.out.println("statement...8");
        }
        System.out.println("statement...9");
    }
}
