package assignment2;

import java.util.Scanner;

//Write a program to relate two integers entered by the user using = =or > or < sign.
public class Quest14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a==b){
            System.out.println("a is equal to b.");
        }
        else if(a>b){
            System.out.println("a is greater than b.");
        }
        else{
            System.out.println("b is greater than a.");
        }

    }
}
