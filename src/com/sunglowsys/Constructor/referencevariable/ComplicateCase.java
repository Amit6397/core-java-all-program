package com.sunglowsys.Constructor.referencevariable;

public class ComplicateCase {
    int id= 101;
    String name = "Amit";


    public static void main(String[] args) {
        ComplicateCase cas = new ComplicateCase();
        System.out.println(cas.id+"/"+cas.name);

        ComplicateCase cas1 = new ComplicateCase();

        System.out.println(cas1.id+"/"+ cas.name);
    }
}


                                          /*i am initialize value  by using reference variable

                                          this case complicate so this case can not use in constructor

                                         because I have create two object so return same employee values not a unique id and name  */
