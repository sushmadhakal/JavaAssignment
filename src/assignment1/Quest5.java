package assignment1;

//Write a program to find the area of a circle, rectangle, and triangle.
public class Quest5 {
    public static void main(String[] args) {
        final float VALUE_OF_PI = 3.14F;
        int radius = 5;
        int length = 8;
        int width = 4;
        int height = 10;
        int base = 12;

        float areaOfCircle = VALUE_OF_PI*radius*radius;
        int areaOfRectangle = length * width;
        int areaOfTriangle = (base*height)/2;

        System.out.println("The area of circle is: " +areaOfCircle);
        System.out.println("The area of rectangle is: " +areaOfRectangle);
        System.out.println("The area of triangle is: " +areaOfTriangle);

    }
}
