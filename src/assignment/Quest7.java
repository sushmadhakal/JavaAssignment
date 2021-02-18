package assignment;

import java.util.Scanner;

//Write a program that reads the radius and length of a cylinder and computes volume.
public class Quest7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = input.nextInt();
        System.out.println("Enter length: ");
        int length = input.nextInt();

        float VALUE_OF_PI = 3.14F;

        float volume = VALUE_OF_PI * radius * radius * length;

        System.out.println("The volume of cylinder is: " +volume);
    }

}
