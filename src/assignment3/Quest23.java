package assignment3;

import java.util.Scanner;

//Write a Program to sum 1 to nth natural numbers.
public class Quest23 {
    public int summation(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
             sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        Quest23 object = new Quest23();
        int result = object.summation(num);

        System.out.println("Sum is: "+result);

    }

}



