package com.sunglowsys.oops.abstractclass;

abstract class Bank {
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class Axis extends Bank{
    int getRateOfInterest(){
        return 8;
    }

}
class Test{
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("SBI BANK getRateOfInterest:= "+b.getRateOfInterest()+"%");
        b=new Axis();
        System.out.println("Axis bank getRateOfInterest:= "+b.getRateOfInterest()+"%");
    }
}
