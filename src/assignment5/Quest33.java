package assignment5;

import java.util.Scanner;

//Write a Program to display numbers in ascending order in array.
public class Quest33 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int [] numbers = new int[size];
        for(int i = 0; i<size;i++){
            System.out.println("Enter the elements of array: ");
            numbers[i]= input.nextInt();
        }
        for(int i = 0; i<size;i++){
            for(int j = i+1; i<size;i++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < size - 1; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[size - 1]);
        }
}
