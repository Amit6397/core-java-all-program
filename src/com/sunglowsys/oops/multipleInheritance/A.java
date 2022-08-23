package com.sunglowsys.oops.multipleInheritance;

interface A {
    static void msg(){
        System.out.println("hello");

}   }
class B implements A{
    static void msg(){
        System.out.println("welcome");
    }
}
class C extends B{                                                              //by suport interface can not suport java
    public static void main(String[] args) {
        C c = new C();
        c.msg();


    }
}