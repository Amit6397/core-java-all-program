package com.sunglowsys.superkeyword;

public class
UseSuper {
    int i = 20;

}
class Demo extends UseSuper{
    int i = 30;

    public void run(String name){
        System.out.println("this keyword print:="+this.i+" "+"super keyword print:="+super.i);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.run("Amit kashyap ");
    }
}

            /* this keyword is a reference variable that can be used  to current calss instance variable

                this keyword refer the class and constructor and method

             */

            /*
                Super keyword is a reference variable  that can be used to parent class instance variable and
                method
                and
                constructor
             */