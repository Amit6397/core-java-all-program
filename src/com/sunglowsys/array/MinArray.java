package com.sunglowsys.array;

public class MinArray {
    public static void main(String[] args) {
        int min;
        int arr[]={10,20,30,40,50,54,34,60};
        min=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min number:="+min);
    }
}
