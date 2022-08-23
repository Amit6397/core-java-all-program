package com.sunglowsys.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Amit");
        list.add("Anil");
        list.add("Amit");
        list.add("Anil");

        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
