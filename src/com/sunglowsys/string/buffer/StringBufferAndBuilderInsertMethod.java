package com.sunglowsys.string.buffer;

public class StringBufferAndBuilderInsertMethod {
    public static void main(String[] args) {
        StringBuffer buffer =  new StringBuffer("Welcome");

        StringBuilder builder = new StringBuilder("Hello");


        buffer.insert(1,"java");

        builder.insert(1,"java");


        //Insert() method inserts the given String with this string at the given position

        //String Buffer Insert() method OutPut====Wjavaelcome
        //String Builder Insert() method OutPut====Hjavaello

        System.out.println(buffer);
        System.out.println(builder);
    }
}
