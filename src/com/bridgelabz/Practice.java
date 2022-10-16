package com.bridgelabz;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
       int arr[] = {10,20,30,40,50};
       for (int i=0;i<arr.length;i++){
           if (num == arr[i]){
               System.out.println("present num");
           }
       }
    }
}