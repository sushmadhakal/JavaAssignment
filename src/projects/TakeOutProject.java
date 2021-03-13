package projects;

import java.util.Scanner;

public class TakeOutProject {


    public static void displayMainMenu(){
        System.out.println("Choose what type of food you'd like to order?");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
    }
    public static void displayItalianMenu(){
        System.out.println("Choose one: ");
        System.out.println("1. lasagna tray Feeds 5- 17.99");
        System.out.println("2. Pizza pack - feeds 7-15.99");
        System.out.println("3. Gazpacho Soup, salad, and bread pack -feeds 4-12.99");
    }
    public static void displayChineseMenu(){
        System.out.println("Choose one: ");
        System.out.println("1. chicken and broccoli tray feeds 7 - 18.99");
        System.out.println("2. Sweet and sour pork tray - feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray - feeds 5-10.99");
    }
    public static void displayAmericanMenu(){
        System.out.println("Choose one: ");
        System.out.println("1. Hamburger and hot dog tray - feeds 8 - 21.99");
        System.out.println("2. grilled chicken sandwich tray- feeds 5 - 22.99");
        System.out.println("3. Barbecue Tray: Feeds 10 - 26.99");
    }
    public static int determineTrays(int people, int feeds){
        int trays = (int) Math.floor(people/feeds);
        System.out.println("You need "+trays+" trays");
        return trays;
    }
    public static double getSubtotal(double price, int trays){
        double subtotal = price * trays;
        System.out.println("Price for "+trays+" trays is: "+subtotal);
        return subtotal;
    }
    public static double getTax(double subtotal, double taxrate){
        double tax = subtotal * taxrate/100;
        System.out.println("Tax: "+tax);
        return tax;
    }
    public static double getTip(double subtotal, double tiprate){
        double tip = subtotal * tiprate/100;
        System.out.println("Tip: "+tip);
        return tip;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip ){
        double grandTotal = subtotal + tax + tip;
        System.out.println("Total (food, tax, tip): "+grandTotal);
        return grandTotal;
    }
    public static double pricePerPerson(double grandTotal, int people){
        double pricePerPerson = grandTotal/people;
        System.out.println("Price per person: "+pricePerPerson);
        return pricePerPerson;
    }
    public static int determineLeftovers(int feeds, int trays, int people) {
        int leftovers = trays * feeds - people;
        System.out.println("Leftover: "+leftovers);
        return leftovers;
    }

}
