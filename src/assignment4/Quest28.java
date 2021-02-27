package assignment4;

//Write a program in a single class having the following functions.
//isPrimenumber(int)
//firstNthPrime(int )
//allPrimebetween(int start , int  end)

import java.util.Scanner;

public class Quest28 {

    public void isPrimenumber(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        Quest28 object = new Quest28();
        object.isPrimenumber(number);

    }

}
