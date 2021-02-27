package assignment2;

//Write a program to calculate leap year.
public class Quest17 {
    public static void main(String[] args) {
        int year = 2020;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap Year");
            }
        else    {
        System.out.println("Not a leap year!!");
    }
}
}


