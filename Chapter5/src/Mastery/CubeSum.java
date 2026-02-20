/*

Program:CubeSum.java         Last Date of this Revision:February 10th 2026

Purpose:Create a CubeSum application that prompts the user for a non-negative integer then displays the sum of the cubes of the digits. 
 
 
Author: Yemikael Melaku Berihun 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class CubeSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (Scanner input = new Scanner(System.in)) {
			// INPUT
			System.out.print("Enter a positive integer: ");
			int number = input.nextInt();
			// PROCESSOR
			int sum = 0;
			while (number > 0) {
			    int digit = number % 10;      // get last digit
			    sum += digit * digit * digit; // cube it and add
			    number /= 10;                 // remove last digit
			}

			// OUTPUT
			System.out.println("The sum of the cubes of the digits is: " + sum);
		}
    }
}

/* Screen Dump
Enter a positive integer: 8729
The sum of the cubes of the digits is: 1592
 */