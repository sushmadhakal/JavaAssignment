package assignment3;

import java.util.Scanner;

//Write a program to print the table of given numbers.
public class Quest22 {
    public void printTable(int num){
        for(int i= 1; i<=10; i++){
            int table = num * i;
            System.out.println(num+ "x"+i+ "=" +table);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        Quest22 object = new Quest22();
        object.printTable(num);
    }
}
