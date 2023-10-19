package com.bridgelabz;

import java.util.Scanner;

public class ElementOfArray {
    public void element(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n= sc.nextInt();
        int[] ar=new int[n];
        for (int i=0; i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        System.out.println("Element : ");
        for (int j : ar) {
            System.out.println(j);
        }
    }
}
