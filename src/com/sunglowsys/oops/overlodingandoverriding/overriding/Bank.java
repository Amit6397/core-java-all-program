package com.sunglowsys.oops.overlodingandoverriding.overriding;

public class Bank
{
    int  getRateInterest(){
        return 0;
    }
}                                                            // 1...same method
                                                             // 2... diffrent class
class SBI extends Bank{                                      // 3...same argument
    int getRateInterest(){
        return 7;
    }
}
class Axis extends Bank{
    int getRateInterest(){
        return 8;

    }
}
class ICICI extends Bank{
    int getRateInterest(){
        return 9;
    }
}
class TestExam {
    public static void main(String[] args) {
        SBI s=new SBI();
        Axis a=new Axis();
        ICICI i = new ICICI();
        System.out.println("SBI getRateInterest:"+s.getRateInterest());
        System.out.println("Axis bank getRateInterest:"+a.getRateInterest());
        System.out.println("ICICI bank getRateInterest:"+i.getRateInterest());

    }
}
