package assignment;

import java.util.Scanner;

//Write a program to accept the roll, name, and nationality of the person
// and display those values in good format.
public class Quest12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        int roll = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter nationality: ");
        String nationality = input.next();

        System.out.println(roll+ " " +name+ " " +nationality);
    }
}
