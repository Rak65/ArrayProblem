package com.bridgelabz;

import java.util.Scanner;

public class Frequency {
    public void frequencyOfEle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] ar = new int[size];
        for (int i=0; i < ar.length; i++){
            ar[i]=sc.nextInt();
        }

        for (int j=0; j < ar.length; j++){
            int count =0;
            int element =ar[j];

            for (int k = 0; k < j; k++){
                if (ar[k]==element)
                    count++;
            }

            if (count==0){
                count=1;
                for (int z =j+1; z< ar.length; z++){
                    if (ar[z]==element)
                        count++;
                }
                System.out.println(ar[j]+" --------> "+count+" times");
            }
        }
    }
}
