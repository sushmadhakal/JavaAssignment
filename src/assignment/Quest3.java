package assignment;

import java.util.Scanner;

//Write a program to find sum and average of two numbers input by User (using Scanner class).
public class Quest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        int sum = a + b;
        int average = sum/2;

        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);


    }
}
