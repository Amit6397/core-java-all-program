package com.sunglowsys.Constructor;

public class One{

        public One(){

        System.out.println("a");
    }


}
class Two extends One{

      public Two(String name){

        System.out.println(name);
    }
}
class Test{
    public static void main(String[] args) {
        Two t = new Two("amit");
    }
}
