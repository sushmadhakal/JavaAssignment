package assignment4;

import java.util.Scanner;

//Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….
public class Quest30 {
    public void printFibonacci(int count){
        int num1 = 0;
        int num2 = 1;
        for(int i =0; i < count; i++){
            System.out.print(num1+ " ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count of the sequence: ");
        int count = input.nextInt();

        Quest30 obj = new Quest30();
        obj.printFibonacci(count);
    }
}
