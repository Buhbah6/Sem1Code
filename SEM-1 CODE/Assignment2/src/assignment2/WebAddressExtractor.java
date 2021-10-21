package assignment2;

import java.util.Scanner;

/**
 * @author Anthony Nadeau
 */
public class WebAddressExtractor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Input
        System.out.print("Please input a web address: ");
        String address = console.nextLine();
        
        //Calculations
        String heading = address.substring(0, address.indexOf('.'));
        String company = address.substring(address.indexOf('.') + 1, 
                address.lastIndexOf('.'));     
        String extension = address.substring(address.lastIndexOf('.') + 1);       
        address = address.toLowerCase();
        heading = heading.toLowerCase();
        company = company.toLowerCase();
        extension = extension.toLowerCase();
     
        //Output
        System.out.printf("%-15s: %s\n", "Address", address);
        System.out.printf("%-15s: %s\n", "Heading", heading);
        System.out.printf("%-15s: %s\n", "Company", company);
        System.out.printf("%-15s: %s\n", "Extension", extension);
    }     
}
