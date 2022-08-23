package com.sunglowsys.oops.overlodingandoverriding.overloding;

public class OverlodingExample {

    int add(int a , int b ) {               // Method overloding main point
                                            // 1...same method
        return a+b;                         // 2...with in same class
                                            // 3...diffrent argument in method
                                            // 5...no of argument
                                            // 4... type of argument
    }
    int add(int a , int b , int c){
        return a+b+c;
    }
    double add(double a , double b , double c ){

        return a+b+c;
    }
}
class Test {
    public static void main(String[] args) {
        OverlodingExample s = new OverlodingExample();
        System.out.println(s.add(10,20,30));
        System.out.println(s.add(10,40,34));
        System.out.println(s.add(13.0,30.0,40.0));

    }
}
