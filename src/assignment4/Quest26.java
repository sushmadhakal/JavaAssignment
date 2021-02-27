package assignment4;

//Write a Program to reverse the given number. //123 => 321

import java.util.Scanner;

public class Quest26 {

    public static void reverseNumber(int num){
        int reversenum =0;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        System.out.println("Reverse of input number is: "+reversenum);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number: ");
        int num = in.nextInt();

       reverseNumber(num);
    }

}
