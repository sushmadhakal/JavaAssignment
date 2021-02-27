package assignment3;

import java.util.Scanner;

//Write a program to display the largest number from given three values.
public class Quest18 {
    //method declaration
    public void findLargest(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("A is the largest number!");
        }
        else if(b>a && c<b){
            System.out.println("B is the largest number");
        }
        else{
            System.out.println("C is the largest number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 values: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Creating object of the class Quest18
        Quest18 ob = new Quest18();

        //calling the method using the object
        ob.findLargest(a, b, c);
    }
}
