package com.sunglowsys.oops.multilevelInheritance;

public class Animal {
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("runing....");
    }
}
class Cat extends Dog{
    void cry(){
        System.out.println("crying....");
    }
}
class Lion extends  Cat{
    void roar(){
        System.out.println("roaring....");
    }
}
class Try {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
        l.run();
        l.cry();
        l.roar();


    }
}
