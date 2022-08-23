package com.sunglowsys.mainmethodoverloded;

public class OverloadedMainMethod {

    public static void main(String[] args) {

        OverloadedMainMethod over = new OverloadedMainMethod();
        System.out.println("1");
        main("amit kashyap");
    }
    public static void main(String name) {
        System.out.println(name);

    }
}

        /*
            can we overload java main() method ?

            ans- yes we can have any number of main methods in a class by method overloading
            jvm always call main() method which receives string array as argument only
         */