package assignment1;

import java.util.Scanner;

//Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds,
// converts it to kg and displays the result [1 pound is 0.454 kg].
public class Quest9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        int pound = input.nextInt();

        double kg = pound * 0.454;

        System.out.println(pound+ " pounds = " +kg);


    }
}
