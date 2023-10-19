package com.bridgelabz;

import java.util.Scanner;

public class ReverseOrder {
    public void rev(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n= sc.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < ar.length; i++){
            ar[i]= sc.nextInt();
        }
        System.out.println("Reverse order : ");
        for (int j=0; j< ar.length; j++){
            System.out.print(ar[ar.length-1-j]+" ");
        }
    }
}
