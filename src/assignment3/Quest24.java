package assignment3;

import java.util.Scanner;

//Write a program to print the factorial number of given numbers.
public class Quest24 {
    public void printFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is: " + fact);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        Quest24 object = new Quest24();
        object.printFactorial(num);
    }
}
