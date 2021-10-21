package assignment4;

/**
 * @author Anthony Nadeau
 */
public class Task1 {
    public static void main(String[] args) {
        //Enter code here
    }
    /**
     * Calculates the amount of days in the month inputted 
     * (switch case version)
     * @param month the month inputted
     * @param year the year inputted
     * @return the amount of days in the month inputted
     */
    public static int calcDays1(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year) == true)
                    return 29;
                else
                    return 28;
            case 1:
                return 31;
            case 3:
                return 31;
            case 5:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            default:
                break;
        }
        return 30;
    }
    /**
     * Calculates the amount of days in the month inputted 
     * (if, else if, else version)
     * @param month the month inputted
     * @param year the year inputted
     * @return the amount of days in the month inputted
     */
    public static int calcDays2(int month, int year) {
        if (month == 2) {    
            if (isLeapYear(year) == true) 
                return 29;
            else
                return 28;
            }
        else if (month == 1)
            return 31;
        else if (month == 3)
            return 31;
        else if (month == 5)
            return 31;
        else if (month == 7)
            return 31;
        else if (month == 8)
            return 31;
        else if (month == 10)
            return 31;
        else if (month == 12)
            return 31;
        return 30;
    }
    /**
     * Checks to see if the year inputted is a leap year 
     * @param year is the year inputted
     * @return true or false -> if the year inputted is a leap year
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else if (year % 400 != 0)
            return false;
        else 
            return true;     
    }
}
