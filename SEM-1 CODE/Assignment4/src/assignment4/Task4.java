package assignment4;
/**
 * @author Anthony Nadeau
 */
public class Task4 {
    public static void main(String[] args) {
        //Enter code here
    }
    /**
     * Converts a digit score to a letter score.
     * @param digitScore number inputted  
     * @return letter score -> Ex. 'A'
     */
    public static char toLetterScore(double digitScore) {
        if (digitScore <= 100 && digitScore >= 90)
            return 'A';
        if (digitScore < 90 && digitScore >= 80)
            return 'B';
        if (digitScore < 80 && digitScore >= 70)
            return 'C';
        if (digitScore < 70 && digitScore >= 60)
            return 'D';
        if (digitScore < 60 && digitScore >= 0)
            return 'F';
        return 'F';          
    }
    /**
     * Prints a message depending on the letterScore given.
     * (switch case version)
     * @param letterScore letter score assigned to a grade.
     */
    public static void printMessage1(char letterScore) {
        switch (letterScore) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                break;
        }
    }
    /**
     * Prints a message depending on the letterScore given.
     * (if else if version)
     * @param letterScore letter score assigned to a grade.
     */
    public static void printMessage2(char letterScore) {
        if (letterScore == 'A')
            System.out.println("Excellent");
        else if (letterScore == 'B' || letterScore == 'C')
            System.out.println("Well done");
        else if (letterScore == 'D')
            System.out.println("Passed");
        else if (letterScore == 'F')
            System.out.println("Better try again");
    }
}