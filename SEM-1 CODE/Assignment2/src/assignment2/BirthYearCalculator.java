package assignment2;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class BirthYearCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Input
        System.out.print("Please input a birth year: ");
        String birthYear = console.nextLine();
        
        //Calculations
        String century = birthYear.substring(0, 2);
        char decadeChar = birthYear.charAt(2);
        int decade = Integer.parseInt(String.valueOf(decadeChar)) * 10;
        
        //Output
        System.out.printf("%-10s: %d\n", "Birth Year", Integer.parseInt(birthYear));
        System.out.printf("%-10s: %d\n", "Century", Integer.parseInt(century) + 1);
        System.out.printf("%-10s: %d\n", "Decade", decade);     
    }
}
