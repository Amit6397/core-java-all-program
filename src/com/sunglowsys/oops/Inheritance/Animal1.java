package com.sunglowsys.oops.Inheritance;

import com.sunglowsys.oops.hierarchicalInheritance.Animal;

public class Animal1 {
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal1{
    void run(){
        System.out.println("runing.....");
    }
}
class Lion extends Dog{
    void cry(){
        System.out.println("roar");
    }
}
class Test {
    public static void main(String[] args) {

        Lion l = new Lion();
        l.run();
       l.eat();
       l.cry();



    }
}
