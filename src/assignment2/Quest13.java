package assignment2;

import java.util.Scanner;

//Write a program to print the number entered by the user only if the number entered is negative.
public class Quest13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();

        if(num < 0){
            System.out.println("You entered: "+num);
        }
        System.out.println("============");

    }
}
