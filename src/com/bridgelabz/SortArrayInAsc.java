package com.bridgelabz;

import java.util.Scanner;

public class SortArrayInAsc {
    public void sort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] ar = new int[size];

        for (int i =0; i< ar.length; i++){
            ar[i] = sc.nextInt();
        }

        for (int j=0; j< ar.length;j++){

            for (int k=0; k< ar.length-j-1; k++){
                if (ar[k]>ar[k+1]){
                    int temp=ar[k];
                    ar[k]=ar[k+1];
                    ar[k+1]=temp;
                }
            }
        }
        System.out.println("Sorting array in ascending order.");
        for (int j : ar) {
            System.out.print(j+" ");
        }
    }
}
