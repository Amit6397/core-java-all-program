package com.sunglowsys.domain;

public class PalindromeNumber {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int number=111
                ;
        temp=number;
        while (number>0){
            r=number%10;
            sum=(sum*10)+r;
            number=number/10;


        }
        if (temp==sum) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number"); }


    }
}
