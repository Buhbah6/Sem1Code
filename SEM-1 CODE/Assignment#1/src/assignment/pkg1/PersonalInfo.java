package assignment.pkg1;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Input
        System.out.print("Please enter your name: ");
        String name = console.nextLine();
        System.out.print("Please enter your age: ");
        int age = console.nextInt();
        System.out.print("Please enter your gender: ");
        String gender = console.next();
        console.nextLine();
        System.out.print("Please enter your department: ");
        String department = console.nextLine();
        System.out.print("Please enter the value of PI (3.1415926): ");
        double pi = console.nextDouble();
        System.out.println();
        
        //Output
        System.out.printf("%-15s: %s\n","Name", name);
        System.out.printf("%-15s: %d\n","Age", age);
        System.out.printf("%-15s: %s\n","Gender", gender);
        System.out.printf("%-15s: %s\n","Department", department);
        System.out.printf("%-15s: %.2f\n","PI", pi);

        
    }
    
}
