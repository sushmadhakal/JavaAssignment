package assignment6;

import java.util.Scanner;

//Write a program to reverse the string.
public class Quest40 {
    public static String Reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();

        String reverse = Reverse(str);
        System.out.println(reverse);
    }
}
