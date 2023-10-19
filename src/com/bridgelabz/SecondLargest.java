package com.bridgelabz;

import java.util.Scanner;

public class SecondLargest {
    public void Largest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }
        int largestNo=ar[0];
        int secondLargest = 0;

        for (int i=1; i<ar.length; i++){
            if (ar[i]>largestNo)
                largestNo = ar[i];
        }
        for (int i : ar) {
            if (i > secondLargest && i < largestNo) {
                secondLargest = i;
            }
        }
        System.out.println("Second largest element is : "+secondLargest);
    }
}
