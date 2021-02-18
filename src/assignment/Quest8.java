package assignment;

//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Quest8 {
    public static void main(String[] args) {
        int tempCelcius = 15;
        int tempFahrenheit = 75;

        double fToC = (tempFahrenheit - 32)/1.8;
        double cToF = tempCelcius * 1.8 + 32;

        System.out.println(tempFahrenheit+ "F = "+fToC+ "C");
        System.out.println(tempCelcius+ "C = "+cToF+"F");
    }
}
