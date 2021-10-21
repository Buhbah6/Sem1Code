package assignment3;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // INPUT
        System.out.print("Please enter two numbers, separated by space: ");
        double num1 = console.nextDouble();
        double num2 = console.nextDouble();
        System.out.print("Please enter the operator (+, -, *, or /): ");
        char oper = console.next().charAt(0);
        console.nextLine();
        System.out.print("Please enter a formula, e.g.: \"3.14 * 2\": ");
        String formula = console.nextLine();
        System.out.println(" ");
        
        // CALCULATION
        double result1 = calcResult(num1, num2);
        double result2 = calcResult(num1, num2, oper);
        double result3 = calcResult(formula);
        
        //OUTPUT
        System.out.printf("%-25s : %.2f + %.2f = %.2f\n", "Calling the first method", 
                num1, num2, result1);
        System.out.printf("%-25s : %.2f %c %.2f = %.2f\n", "Calling the second method", 
                num1, num2, result2);
        System.out.printf("%-25s : %s = %.2f\n", "Calling the third method", 
               formula, result3);
    }
    
    /**
     * Calculates addition, with two numbers; num1 and num2
     * @param num1 is the first number inputted
     * @param num2 is the 2nd number inputted
     * @return the sum of num1 and num2
     */
    public static double calcResult(double num1, double num2) {
        return num1 + num2;
    }
    
    /**
     * Calculates the operation decided by the operator, using the numbers given
     * @param num1 is the 1st number inputted
     * @param num2 is the 2nd number inputted
     * @param oper is the operator (+, -, *, /)
     * @return the result of the operation
     */
    public static double calcResult(double num1, double num2, char oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return num1 / num2;
        }  
    }
    
    /**
     * Calculates the result of the formula inputted.
     * @param formula is the formula inputted by the user
     * @return the result of the formula
     */
    public static double calcResult(String formula) {
        double num1 = Double.valueOf(formula.substring(0, formula.indexOf(" ")));
        char oper = formula.charAt(formula.indexOf(" ") + 1);
        double num2 = Double.valueOf(formula.substring(formula.lastIndexOf(" ")));
        return calcResult(num1, num2, oper);
    }
}
