package com.sunglowsys.oops.Inheritance;

public class Animal {
    void showA(){
        System.out.println("one");
    }
}
class Cat extends Animal{
    void showB(){
        System.out.println("two");
    }
}
class Bear extends Animal{
    void showC(){
        System.out.println("three");
    }

    public static void main(String[] args) {

        Bear b = new Bear();
        b.showA();
        b.showC();



    }
}
