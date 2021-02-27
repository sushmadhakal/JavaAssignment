package assignment3;

//Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

import java.util.Scanner;

public class Quest19 {
    public static void findTriangle(int x, int y, int z){
    if(x==y && y == z){
        System.out.println("Equilateral Triangle");
    }
    else if(x==y || x==z || y==z){
        System.out.println("Isosceles Triangle");
    }
    else{
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        findTriangle(a, b, c);
    }
}
