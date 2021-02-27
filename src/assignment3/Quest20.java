package assignment3;

//Write a program to create the equivalent of a four-function calculator.
// The program to enter two integer’s numbers and an operator.
//It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers.
// Finally, it displays the result.

import java.util.Scanner;

public class Quest20 {
    public static void calculate(int num1, int num2){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your choice: ");
        String choice = input.next();


        switch(choice){
            case "add":
                int add = num1 + num2;
                System.out.println(add);
                break;
            case "sub":
                int sub = num1 - num2;
                System.out.println(sub);
                break;
            case "mult":
               int mult = num1 * num2;
               System.out.println(mult);
                break;
            case "div":
               int div = num1 / num2;
                System.out.println(div);
                break;
            default:
                System.out.println("Enter valid choice!!!");
        }
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;
      calculate( num1, num2);
    }
}
