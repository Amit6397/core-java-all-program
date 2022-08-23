package com.sunglowsys.array;

public class FindBIgElement {

    public static void main(String[] args){
        int max;
        int arr[]={10,20,70,40,60};
        max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum values:"+max);
    }
}


