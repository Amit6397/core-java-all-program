package com.sunglowsys.oops.finalKeword.finalvariable;


class Bike {
    static final int speedlimit = 90;

    void run() {
       // speedlimit=80;                        //FINAL VARIABLE CAN NOT be CHANGE THE VALUES
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}

