package projects;

import java.util.Scanner;

public class TakeoutProjectTest {
    public static void main(String[] args) {

        double taxrate = 10;
        double tiprate = 10;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int numOfPeople = input.nextInt();

        int choicemainmenu = 0;
        if(numOfPeople<=20){
            TakeOutProject.displayMainMenu();
            choicemainmenu = input.nextInt();
        }
        else{
            System.out.println("Number of people are invalid!");
        }

        switch (choicemainmenu) {
            case 1 -> TakeOutProject.displayItalianMenu();
            case 2 -> TakeOutProject.displayChineseMenu();
            case 3 -> TakeOutProject.displayAmericanMenu();
            default -> System.out.println("Invalid!");
        }
         int choicefood = input.nextInt();

        if(choicemainmenu == 1 && choicefood == 1 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,5);
            double subtotal = TakeOutProject.getSubtotal(17.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(5, trays, numOfPeople);
        }

        else if(choicemainmenu == 1 && choicefood == 2 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,7);
            double subtotal = TakeOutProject.getSubtotal(15.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(7, trays, numOfPeople);
        }

        else if(choicemainmenu == 1 && choicefood == 3 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,4);
            double subtotal = TakeOutProject.getSubtotal(12.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(4, trays, numOfPeople);
        }

        else if(choicemainmenu == 2 && choicefood == 1 ) {
            int trays = TakeOutProject.determineTrays(numOfPeople, 7);
            double subtotal = TakeOutProject.getSubtotal(18.99, trays);
            double tax = TakeOutProject.getTax(subtotal, taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(7, trays, numOfPeople);
        }

        else if(choicemainmenu == 2 && choicefood == 2 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,7);
            double subtotal = TakeOutProject.getSubtotal(18.99, trays);
            double tax = TakeOutProject.getTax(subtotal, taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(7, trays, numOfPeople);
        }

        else if(choicemainmenu == 2 && choicefood == 3 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,5);
            double subtotal = TakeOutProject.getSubtotal(10.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(5, trays, numOfPeople);
        }

        else if(choicemainmenu == 3 && choicefood == 1 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,8);
            double subtotal = TakeOutProject.getSubtotal(21.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(8, trays, numOfPeople);
        }

        else if(choicemainmenu == 3 && choicefood == 2 ){
            int trays = TakeOutProject.determineTrays(numOfPeople,5);
            double subtotal = TakeOutProject.getSubtotal(22.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(5, trays, numOfPeople);
        }

        else if(choicemainmenu == 3 && choicefood == 3){
            int trays = TakeOutProject.determineTrays(numOfPeople,10);
            double subtotal = TakeOutProject.getSubtotal(26.99, trays);
            double tax = TakeOutProject.getTax(subtotal,taxrate);
            double tip = TakeOutProject.getTip(subtotal,tiprate);
            double grandTotal = TakeOutProject.getGrandTotal(subtotal, tax, tip);
            double pricePerPerson = TakeOutProject.pricePerPerson(grandTotal, numOfPeople);
            int leftovers = TakeOutProject.determineLeftovers(10, trays, numOfPeople);
        }

        else
            System.out.println("Invalid!!!");
    }
}
