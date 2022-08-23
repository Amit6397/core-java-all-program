package com.sunglowsys.oops.finalKeword.finalmethodinherited;

public class Bike {
    final void run(){
        System.out.println("running....");
    }
}                                                       //YES FINAL METHOD CAN Have THE INHERITED
class Honda extends Bike{
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }

}
