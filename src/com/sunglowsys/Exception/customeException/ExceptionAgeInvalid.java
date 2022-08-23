package com.sunglowsys.Exception.customeException;

import java.io.InvalidClassException;

public class ExceptionAgeInvalid extends Exception {

    public ExceptionAgeInvalid(String str) {
        super(str);
    }

}
class TestCustomException{
    static void validate(int age)throws InvalidClassException{
        if (age<18){
            throw new InvalidClassException("age is not valid to vote");
        }else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(18);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest of code.....");
    }
}
