package com.sunglowsys.oops.overlodingandoverriding.overloding;

public class Automation {

    void show(int a){

        System.out.println("int method call");
    }
    void show(String a){

        System.out.println("String method call");
    }

    public static void main(String[] args) {
        Automation a = new Automation();
        a.show("amiy");//this case print show(String a) method not print  show(int a) method

        a.show('a'); //this case print show(int a) method not print show(String a) method

        /*
            i am using character 'a' so print show ("int method call") method in
            this case can not print show(String a) method("string method")
         */



    }
}
                /*
                    Automatic promotion mens one type promoted to another implicitly if no matching datatype

                 */