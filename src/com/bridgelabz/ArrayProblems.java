package com.bridgelabz;

import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning=true;
        while (isRunning){
            System.out.println("Which program you want to run.");
            System.out.println("1. Elements of an array");
            System.out.println("2. Frequency of each element.");
            System.out.println("3. Largest Element.");
            System.out.println("4. Smallest Element.");
            System.out.println("5. Print Even position");
            System.out.println("6. Reverse order.");
            System.out.println("7. Print Odd position");
            System.out.println("8. Duplicate Elements");
            System.out.println("9. Sorting array in ascending order.");
            System.out.println("10. Second Largest Number");
            System.out.println("11. Exit");

            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    ElementOfArray element=new ElementOfArray();
                    element.element();
                    break;
                case 2:
                    Frequency frequency = new Frequency();
                    frequency.frequencyOfEle();
                    break;
                case 3:
                    LargestElement l = new LargestElement();
                    l.largestEle();
                    break;
                case 4:
                    SmallestElement s = new SmallestElement();
                    s.smallestEle();
                    break;
                case 5:
                    EvenPosition position= new EvenPosition();
                    position.position();
                    break;
                case 6:
                    ReverseOrder rev= new ReverseOrder();
                    rev.rev();
                    break;
                case 7:
                    OddPosition pos = new OddPosition();
                    pos.oddPos();
                    break;
                case 8:
                    DuplicateElement duplicateElement = new DuplicateElement();
                    duplicateElement.duplicate();
                    break;
                case 9:
                    SortArrayInAsc sortArrayInAsc = new SortArrayInAsc();
                    sortArrayInAsc.sort();
                    break;
                case 10:
                    SecondLargest secondLargest = new SecondLargest();
                    secondLargest.Largest();
                    break;
                case 11:
                    isRunning=false;
                    break;
                default:
                    System.out.println("Try again :----");
            }
        }
    }
}
