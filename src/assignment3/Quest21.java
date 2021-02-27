package assignment3;

import java.util.Scanner;

////Program to input the number of (1...7)
// and translate to its equivalent name of the day of the week.
public class Quest21 {
    public void translate(int num){
        switch(num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a number between 1 to 7!!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        Quest21 obj = new Quest21();
            obj.translate(num);


    }
}
