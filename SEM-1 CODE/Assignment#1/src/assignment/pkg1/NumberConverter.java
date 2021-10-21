package assignment.pkg1;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class NumberConverter {
    public static void main(String[] args) {
       
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a 4-digit Octal number: ");
        int octalNum = console.nextInt();
        System.out.println(" ");
        
        //Calculations
        int digit1 = octalNum % 10;
        int digit2 = octalNum / 10 % 10;
        int digit3 = octalNum / 100 % 10;
        int digit4 = octalNum / 1000 % 10;
        int decimalNum = (int) (digit4 * Math.pow(8, 3)
                + digit3 * Math.pow(8, 2)
                + digit2 * Math.pow(8, 1)
                + digit1 * Math.pow(8, 0));
        
        //Output
        System.out.printf("%-15s: %5d\n", "Octal Number", octalNum);
        System.out.printf("%-15s: %5d\n", "Decimal Number", decimalNum);
             
    }
}
