package com.sunglowsys.oops.finalKeword.finalmethod;

public class Bike {
    final void run(){
        System.out.println("running....");
    }

}
class Honda extends Bike{
   /* void run(){
        System.out.println("running sefely.....");
    }*/                                                                            //FINAL METHOD CAN NOT OVERRIDE

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
}
