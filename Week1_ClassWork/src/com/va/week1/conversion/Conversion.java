package com.va.week1.conversion;

import java.util.Scanner;

/*
 * a. convert a temperature value from Fahrenheit to Celsius 
 * 
 * b. convert miles to kms
 * 
 * c. Litres to Gallons .. ? 
 * 
 */


public class Conversion {
	
	public static void main(String[] args)
	{
		
		/*
		 * ---write the code for a.  and b. 
		 */
	/*	
		 Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter temperature in Fahrenheit: ");
	        double fahrenheit = input.nextDouble();
	
	        // Calculate Celsius temperature using the formula
	        double celsius = (fahrenheit - 32) * 5.0 / 9.0;	
	     
	        System.out.println(fahrenheit + "°F is equal to " + String.format("%.2f", celsius) + "°C");

	        input.close();
	 */
		
	 /*----- logic for miles to kms...*/
	        
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	     // Prompt the user to enter miles
	        System.out.print("Enter distance in miles: ");
	        double miles = scanner.nextDouble();
	        
	     // Conversion factor
	        double kilometers = miles * 1.60934;
	        
	     // Display the result
	        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

	        // Close the scanner
	        scanner.close();
	        
	        
	        
	}

}
