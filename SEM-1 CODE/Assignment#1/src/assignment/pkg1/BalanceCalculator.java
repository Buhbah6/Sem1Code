package assignment.pkg1;

import java.util.Scanner;

/**
 * @author Anthony Nadeau 
 */
public class BalanceCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Input
        System.out.print("Please enter the initial balance: $");
        double initialBal = console.nextDouble();
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double annualInterest = console.nextDouble();
        System.out.print("Please enter the number of years the client wants to "
                + "save the money in the bank: ");
        int years = console.nextInt();
        System.out.println(" ");
    
        //Calculations
        double newBal = initialBal * Math.pow((100 + annualInterest) / 100, years);
    
        //Output
        System.out.printf("%-25s: %10.2f\n", "Initial Balance", initialBal);
        System.out.printf("%-25s: %9.2f%%\n", "Annual Interest Rate", annualInterest);
        System.out.printf("%-25s: %10d\n", "Saving Years",years);
        System.out.println("--------------------------------------");
        System.out.printf("%-25s: %10.2f\n", "Balance after " + years + " Years", newBal);
    
    }
}
