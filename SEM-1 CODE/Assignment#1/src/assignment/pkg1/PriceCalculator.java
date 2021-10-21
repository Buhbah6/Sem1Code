package assignment.pkg1;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class PriceCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        //Input
        System.out.print("Please enter the item price: ");
        double itemPrice = console.nextDouble();
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discount = console.nextDouble();
        System.out.println(" ");
        
        //Calculations
        double priceBeforeTax = itemPrice - (itemPrice * (discount * 0.01));
        double fedTax = 0.05; // Ratio for Federal Tax in Canada
        double provTax = 0.0975; // Ratio for Provincial Tax in Quebec
        double priceProvTax = priceBeforeTax * provTax;
        double priceFedTax = priceBeforeTax * fedTax;
        double finalPrice = priceBeforeTax + (priceBeforeTax * fedTax) + 
                (priceBeforeTax * provTax);
                     
        //Output
        System.out.printf("%-20s: %5.2f\n", "Original Price", itemPrice);
        System.out.printf("%-20s: %4.2f%%\n", "Discount Ratio", discount);
        System.out.printf("%-20s: %5.2f\n", "Price Before Tax", priceBeforeTax);
        System.out.println("-------------------------------");
        System.out.printf("%-20s: %5.2f\n", "Federal Tax", priceFedTax);
        System.out.printf("%-20s: %5.2f\n", "Provincial Tax", priceProvTax);
        System.out.printf("%-20s: %5.2f\n", "Final Price", finalPrice);
        
    
    }        
}
