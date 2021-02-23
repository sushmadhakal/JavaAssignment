package assignment1;

import java.util.Scanner;

//Write a program to swap two numbers
//a) using temp variable
public class Quest11a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers x and y: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("Before Swapping: " +x+ " "+y);

        //swapping
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping: " +x+ " "+y);

    }
}
