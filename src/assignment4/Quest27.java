package assignment4;

import java.util.Scanner;

//Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6
public class Quest27 {
    public void getsum(int num){
        int sum = 0;
        while (num!=0){
            int lastdigit = num % 10;
            sum += lastdigit;
            num /= 10;
        }
        System.out.println("Sum: "+sum);
    }

    public void getproduct(int num){
        int product = 1;
        while(num!=0){
            product = product * (num % 10);
            num = num/10;
        }
        System.out.println("product: "+product);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        Quest27 object = new Quest27();
        object.getsum(number);
        object.getproduct(number);
    }
}
