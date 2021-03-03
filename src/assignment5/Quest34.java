package assignment5;

import java.util.Scanner;

//Write a program to reverse the element of an array.
public class Quest34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]arr = new int[4];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter elements:");
            arr[i]= input.nextInt();
        }
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }


    }
}
