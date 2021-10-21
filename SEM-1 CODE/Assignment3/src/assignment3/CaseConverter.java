package assignment3;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class CaseConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //INPUT
        System.out.print("Please enter a word: ");
        String word = console.next();
        System.out.println("Please choose the case you want to convert:");
        System.out.println("1. 'l' or 'L' for lowercase");
        System.out.println("1. 'u' or 'U' for uppercase");
        System.out.println("1. 't' or 'T' for titlecase");
        char caseType = console.next().charAt(0);
        System.out.println(" ");
        
        //CALCULATION
        String conversion1 = convertCase(word);
        String conversion2 = convertCase(word, caseType);
        
        //OUTPUT
        System.out.printf("%-40s : %s\n", "Original word", word);
        System.out.printf("%-40s : %s\n", "Calling the first convertCase method", 
                conversion1);
        System.out.printf("%-40s : %s\n", "Calling the second convertCase method", 
                conversion2);
    }
    
    /**
     * Converts the word inputted into title case(Xxxxx)
     * @param word is the word inputted
     * @return word in title case
     */
    public static String convertCase(String word) {
        word = word.toLowerCase();
        return String.valueOf(Character.toTitleCase(word.charAt(0)) + 
                word.substring(1));    
    }
    
    /**
     * Converts the word to whatever case type is inputted
     * @param word is the word inputted
     * @param caseType is the caseType inputted
     * @return the word converted to the case type 
     */
    public static String convertCase(String word, char caseType) {
        switch (caseType) {
            case 'l':
            case 'L':
                return word.toLowerCase();
            case 'u':
            case 'U':
                return word.toUpperCase();
            default:
                return convertCase(word);
        }
    }
}
