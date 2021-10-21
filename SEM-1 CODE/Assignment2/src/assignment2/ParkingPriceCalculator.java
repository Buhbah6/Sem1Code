package assignment2;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class ParkingPriceCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Input
        System.out.print("Please input the number of minutes your car was parked:  ");
        double minutes = console.nextInt();
        
        //Calculations
        double hours = Math.ceil(minutes / 60);
        double price = hours * 2;
        
        //Output
        System.out.printf("%-25s: %.0f\n", "Parking time(minutes)", minutes);
        System.out.printf("%-25s: %.0f\n", "Parking time(hours)", hours);
        System.out.printf("%-25s: %.2f\n", "Price", price);      
    }
}
