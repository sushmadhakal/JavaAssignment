package assignment6;

import java.util.Scanner;

//Write a program to check whether a given string is palindrome or not.
public class Quest38 {

    public static String checkPalindrome(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();

        String reverse = checkPalindrome(str);

        if(str.equals(reverse)){
            System.out.println("The string is palindrome.");
        }
        else
            System.out.println("Not Palindrome");
    }
}
