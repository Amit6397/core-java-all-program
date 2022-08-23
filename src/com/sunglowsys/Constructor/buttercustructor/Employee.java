package com.sunglowsys.Constructor.buttercustructor;

public class Employee {
    int id;
    String name;

    Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e = new Employee(101,"Amit");
        System.out.println(e.id+" "+e.name);

        Employee e1 = new Employee(102,"Shivam");
        System.out.println(e1.id+" "+e1.name);
    }
}
                    /*we are  create perameterized constructor and i will create two object so
                     that constructor represent unique id and name ............
                     ......................this is a batter way use to constructor*/