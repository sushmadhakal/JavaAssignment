package assignment5;

import java.util.Scanner;

//Write a Program to accept 5 values in an array and display their sum.
public class Quest32 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner input = new Scanner(System.in);
        for(int i =0; i < numbers.length; i++){
            System.out.println("Enter the elements of array: ");
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        for(int i =0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of Array is: "+sum);
    }
}
