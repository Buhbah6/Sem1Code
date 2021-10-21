package assignment4;

import jdk.nashorn.internal.ir.BreakNode;

/**
 * @author Anthony Nadeau
 */
public class Task3 {
    public static void main(String[] args) {
        double futureSalary = calcFutureSalary(10, 10);
        System.out.println(futureSalary);
    }
    /**
    * To calculate the future salary of an employee, if you work less than
    * 5 years, every year your salary increases by 2%, If you work 5 or more
    * years, then every year your salary increases by 5%.
    * @param initSalary Initial salary upon employment
    * @param year amount of years in the future you would like to calculate
    * @return future salary of an employee after said amount of years
    */
    public static double calcFutureSalary(double initSalary, int year) {
        if (year < 3) 
            return initSalary * Math.pow(1 + 0.03, year);
        else if (year >= 3 && year < 10)
            return initSalary * Math.pow(1 + 0.03, 2) *
                    Math.pow(1 + 0.05, year - 2);
        else if (year >= 10)
            return initSalary * Math.pow(1 + 0.03, 2) *
                    Math.pow(1 + 0.05, 7) * Math.pow(1 + 0.08, year - 9);
        return initSalary;
    }
}
