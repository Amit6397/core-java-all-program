package com.sunglowsys.string.buffer;

import java.nio.Buffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello");

        StringBuilder builder = new StringBuilder("Welcome");

        builder.append("java");


        /*string that can modified and changed is known as mutable String StringBuffer and StringBuilder classes are used for creating
        mutable string*/



        buffer.append("java");    //the append method use to concatenates the given argument with this string

        //buffer append() method output==== hellojava
        //builder append() method output======Welcomejava

        System.out.println(builder);



        System.out.println(buffer);


    }
}
