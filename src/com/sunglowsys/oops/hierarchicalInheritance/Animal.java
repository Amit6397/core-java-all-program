package com.sunglowsys.oops.hierarchicalInheritance;

public class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("runing...");
    }
}
class Cat extends Animal{
    void cry(){
        System.out.println("crying...");
    }
}
class Check1{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.cry();
        
    }
}
