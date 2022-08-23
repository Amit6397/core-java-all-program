package com.sunglowsys.Interface;

public interface I1 {                   // interface is a mechanism to achieve abstraction in java
                                    // interface it can not have a method body ,and it can have a one abstract method

    void show();                        // interface it is used to achieve abstraction .


                        // By interface, we can  support the functionality of multiple inheritance .we are implement two interface class
                                        // interface can be used  to achieve loose coupling.
}

interface I2{                              // main impotent que

                                           // we are create  private void show(){} method in interface class by using java 9 future
                                            // we are create static void display(){} method in interface class by using java 8 future
    void display();
}                                           // we are create defoult void show(){} method in interface class by using java 8 future
                                            //
class Demo implements I1,I2{

    public void show(){
        System.out.println("show method print");
    }
    public void display(){
        System.out.println("display method printed");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();

    }
}
