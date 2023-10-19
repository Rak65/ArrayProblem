package com.bridgelabz;

import java.util.Scanner;

public class SmallestElement {
    public void smallestEle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int ele= sc.nextInt();
        int [] ar= new int[ele];
        for (int i=0; i< ar.length; i++){
            ar[i]=sc.nextInt();
        }

        int min=ar[0];
        for (int j= 1; j< ar.length; j++){
            if (ar[j]<min)
                min=ar[j];
        }
        System.out.println("Smallest element : "+min);
    }
}
