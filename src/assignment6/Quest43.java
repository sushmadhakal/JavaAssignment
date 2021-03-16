package assignment6;
//Write a program to trap the exception handling to trap the
// divided by zero and out of index value in array.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Quest43 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int[] array = {20,20,40};
        try {

            for(int i = 0; i <= array.length; i++) {
                System.out.println("The value of array is: " + array[i]);
            }
            int div = a/b;
            System.out.println("The result is: " +div);


        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Error. Array is out of Bounds"+aie);
        } catch (ArithmeticException ae) {
            System.out.println ("Can't be divided by Zero"+ae);
        }
    }

}
