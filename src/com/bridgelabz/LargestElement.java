package com.bridgelabz;

import java.util.Scanner;

public class LargestElement {
    public void largestEle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements.");
        int elements= sc.nextInt();

        int[] ar = new int[elements];
        for (int i=0; i < ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int max = ar[0];
        for (int j=1; j< ar.length; j++){
            if (ar[j]>max)
                max=ar[j];
        }
        System.out.println("Largest element : "+max);
    }
}
