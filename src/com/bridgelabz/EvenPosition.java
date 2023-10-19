package com.bridgelabz;

import java.util.Scanner;

public class EvenPosition {
    public void position(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n= sc.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < ar.length; i++){
            ar[i]= sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++){
            if(i%2==1)
                System.out.println(ar[i]+" is present at even position.");
        }
    }
}
