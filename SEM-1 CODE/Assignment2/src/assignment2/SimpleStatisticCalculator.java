package assignment2;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class SimpleStatisticCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Input
        System.out.print("Please input 5 numbers separated by space: ");
        double num1 = console.nextInt();
        double num2 = console.nextInt();
        double num3 = console.nextInt();
        double num4 = console.nextInt();
        double num5 = console.nextInt();
        
        //Calculations
        double mean = (num1 + num2 + num3 + num4 + num5) / 5;
        double min = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), 
                num4), num5);
        double max = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), 
                num4), num5);
        double SD = StandardDeviation(num1, num2, num3, num4, num5);
        
        //Output
        System.out.printf("%-20s: %.2f, %.2f, %.2f, %.2f, %.2f\n", "Numbers", num1,
                num2, num3, num4, num5);
        System.out.printf("%-20s: %.2f\n", "Mean", mean);
        System.out.printf("%-20s: %.2f\n", "Minimum", min);
        System.out.printf("%-20s: %.2f\n", "Maximum", max);
        System.out.printf("%-20s: %.2f\n", "Standard Deviation", SD);
        
    }
    /**
     * To calculate the standard deviation of 5 double numbers
     * @param num1 is the 1st number inputted by the user
     * @param num2 is the 2nd number inputted by the user
     * @param num3 is the 3rd number inputted by the user
     * @param num4 is the 4th number inputted by the user
     * @param num5 is the 5th number inputted by the user
     * @return the standard deviation of 5 double numbers
     */
    public static double StandardDeviation(double num1, double num2, double num3, 
            double num4, double num5) {
        double mean = (num1 + num2 + num3 + num4 + num5) / 5;
        num1 = Math.pow((num1 - mean), 2);
        num2 = Math.pow((num2 - mean), 2);
        num3 = Math.pow((num3 - mean), 2);
        num4 = Math.pow((num4 - mean), 2);
        num5 = Math.pow((num5 - mean), 2);
        double sum = num1 + num2 + num3 + num4 + num5;
        return Math.sqrt(sum / 5);
    }
}
