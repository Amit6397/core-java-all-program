package com.sunglowsys.oops.abstractclass;

abstract class ExampleAbstractClass {
    abstract void run();
}
class Honda extends ExampleAbstractClass{
    void run(){                                                 //CAN HAVE ONE ABSTRACT METHOD PROGRAM

        System.out.println("running....");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }


}








