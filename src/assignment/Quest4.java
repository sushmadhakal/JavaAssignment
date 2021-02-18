package assignment;

import java.util.Scanner;

//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100
public class Quest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        int p = input.nextInt();
        System.out.println("Enter Time Period: ");
        float t = input.nextFloat();
        System.out.println("Enter rate of Interest: ");
        int r = input.nextInt();

        double simpleRate = (p * t * r)/100;

        System.out.println("The Simple Interest is: " +simpleRate);

    }
}
