/*
Program:Change                                   		Date:12/26/2025 
Purpose:Create a Change application that prompts the user for an amount less than $1.00 and then displays 
the minimum number of coins necessary to make the change 

Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Prompt user
			System.out.print("Enter the change in cents: ");
			int cents = input.nextInt();

			// Calculate coins
			int quarters = cents / 25;
			cents = cents % 25;

			int dimes = cents / 10;
			cents = cents % 10;

			int nickels = cents / 5;
			cents = cents % 5;

			int pennies = cents;

			// Display output
			System.out.println("\nThe minimum number of coins is:");
			System.out.println("  Quarters: " + quarters);
			System.out.println("  Dimes: " + dimes);
			System.out.println("  Nickels: " + nickels);
			System.out.println("  Pennies: " + pennies);
		}
    }
}
/*screenDump
 Enter the change in cents: 3462

The minimum number of coins is:
  Quarters: 138
  Dimes: 1
  Nickels: 0
  Pennies: 2
*/
