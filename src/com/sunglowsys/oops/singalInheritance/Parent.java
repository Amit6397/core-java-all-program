package com.sunglowsys.oops.singalInheritance;

public class Parent {
    int salary = 10000;
}
class Child extends Parent {
    int bonush = 2000;
}
class TestEx{
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("programing salary:"+c.salary);
        System.out.println("programing bonush:"+c.bonush);

    }
}