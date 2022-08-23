package com.sunglowsys.array;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,3,4,5,4,5,6,8,8,3};
        System.out.println("Duplicate element in given array:");

        //Searches for duplicate element

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
