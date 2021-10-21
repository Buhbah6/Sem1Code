package assignment4;

import java.util.Random;

/**
 * @author Anthony Nadeau
 */
public class Task2 {
    public static void main(String[] args) {
        //Enter code here
        double num = calcAverageScore(9);
        System.out.println(num);
    }
    /**
     * Calculates the average score using random scores
     * @param num is the number of scores needed
     * @return the average score, based off the random scores outputted.
     */
    public static double calcAverageScore(int num) {
        Random rand = new Random();
        double avg = 0;
        int numUsed = 0;
        for (int i = 0; i <= num; i++) {
            double randomNum = rand.nextInt(101);
            if (randomNum >= 40) {
                numUsed++;
                avg += randomNum;
            }    
        }
        if (avg == 0)
            return 0;
        else
            return Math.round(avg / numUsed);
    }
}
