package com.sunglowsys.Exception;

public class Example {
    public static void main(String[] args) {
        System.out.println("Started.......");
        try {


            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("we have go to number..");
            int result =n1/n2;
            System.out.println("Division" + result);
        }catch (Exception e){
            System.out.println("n2 can not be 0 !!");
            System.out.println(e.getMessage());
        }


        System.out.println("Terminated");
    }
}
