package assignment3;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class ModuloChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //INPUT 1
        System.out.print("Please enter a number and a base, separated by a space: ");
        int num1 = console.nextInt();
        int base = console.nextInt();
        
        //OUTPUT 1
        if (isDivisible(num1))
            System.out.printf("%d %s %d\n", num1, "is divisible by", 3);
        else
            System.out.printf("%d %s %d\n", num1, "is not divisible by", 3);
        if (isDivisible(num1, base) && base != 3)
            System.out.printf("%d %s %d\n", num1, "is divisible by", base);
        else if (base != 3)
            System.out.printf("%d %s %d\n", num1, "is not divisible by", base);
        System.out.println(" ");
        
        //INPUT 2
        System.out.print("Please enter an English letter: ");
        char letter = console.next().charAt(0);
        System.out.print("Please enter a number base and an English letter base,"
                + " separated by space: ");
        int numBase = console.nextInt();
        char letterBase = console.next().charAt(0);
        System.out.println(" ");
        
        //OUPUT 2
        if (isDivisible(letter))
            System.out.printf("%s %s %d\n", letter, "is divisible by", 3);
        else
            System.out.printf("%s %s %d\n", letter, "is not divisible by", 3);
        if (isDivisible(letter, numBase) && numBase != 3)
            System.out.printf("%s %s %d\n", letter, "is divisible by", numBase);
        else if (numBase != 3)
            System.out.printf("%s %s %d\n", letter, "is not divisible by", numBase);
        if (isDivisible(letter, letterBase) && numBase != 3)
            System.out.printf("%s %s %c\n", letter, "is divisible by", letterBase);
    }
   
    //USER-DEFINED METHODS
    /**
     * Converts a letter to a number value e.g. a = 0
     * @param c is the letter inputted
     * @return number value of a letter
     */
    public static int letterToNumber(char c) {
        return Character.toLowerCase(c) - 'a';
    }
    
    /**
     * Checks to see if a number is divisible by 3 or not
     * @param num is the number inputted
     * @return true or false if the number is divisible by 3
     */
    public static boolean isDivisible(int num) {
        if (num % 3 == 0)
            return true;
        else 
            return false;
    }
    
    /**
     * Checks to see if the number is divisible by the base
     * @param num is the number inputted
     * @param base is the base inputted
     * @return true or false if the number is divisible by the base
     */
    public static boolean isDivisible(int num, int base) {
        if (num % base == 0)
            return true;
        else
            return false;
    }
    
    /**
     * Checks to see if the number value of a letter is divisible by 3
     * @param letter is the letter inputted
     * @return true or false if the number value of a letter is divisible by 3
     */
    public static boolean isDivisible(char letter) {
       int num = letterToNumber(letter);
       if (num % 3 == 0)
           return true;
       else
           return false;
    }
    
    /**
     * Checks to see if the number value of a letter is divisible by the base
     * @param letter is the letter inputted
     * @param base is the base inputted
     * @return true or false if the number value of a letter is divisible by the base
     */
    public static boolean isDivisible(char letter, int base) {
        int num = letterToNumber(letter);
        if (num % base == 0)
            return true;
        else
            return false;
    }
    
    /**
     * Checks to see if the number value of a letter is divisible by the 
     * number value of a base letter
     * @param letter is the letter inputted
     * @param base is the base letter inputted
     * @return true or false if the number value of a letter is divisible by the 
     * number value of a base letter
     */
    public static boolean isDivisible(char letter, char base) {
        int num = letterToNumber(letter);
        int num2 = letterToNumber(base);
        if (num % num2 == 0)
            return true;
        else
            return false;
    }
}
