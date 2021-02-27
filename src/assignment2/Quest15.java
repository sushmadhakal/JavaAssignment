package assignment2;

import java.util.Scanner;

//Write a program that receives an ASCII code
// (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
public class Quest15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code between 0 -128: ");
        int code = input.nextInt();

        if (code > 0 && code < 128) {
            char output = (char) code;

            System.out.println("Input: " + code);
            System.out.println("Output: " + output);
        } else {
            System.out.println("Enter a numebr between 0 to 128: ");
        }
    }
}
