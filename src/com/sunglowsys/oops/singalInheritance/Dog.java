package com.sunglowsys.oops.singalInheritance;

public class Dog {
    void eat() {
        System.out.println("eating......");
    }

}
class Cat extends Dog {
    void run(){
        System.out.println("runing...");
    }
}
class Check{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.run();
        c.eat();
    }
}
