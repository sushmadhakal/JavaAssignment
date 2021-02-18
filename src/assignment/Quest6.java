package assignment;

//Write a program to find the perimeter of a circle, triangle, and rectangle.
public class Quest6 {
    public static void main(String[] args) {
        final float VALUE_OF_PI = 3.14F;
        int radius = 5;
        int length = 8;
        int width = 4;
        int side1 = 10;
        int side2 = 12;
        int side3 = 7;

        float perimeterOfCircle = 2*VALUE_OF_PI*radius;
        int perimeterOfRectangle = 2*length + 2*width;
        int perimeterOfTriangle = side1 + side2 +side3;

        System.out.println("The perimeter of circle is: " +perimeterOfCircle);
        System.out.println("The perimeter of rectangle is: " +perimeterOfRectangle);
        System.out.println("The perimeter of triangle is: " +perimeterOfTriangle);
    }
}
