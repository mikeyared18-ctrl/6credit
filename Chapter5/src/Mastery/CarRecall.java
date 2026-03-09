
/*

Program:CarRecall.java   Last Date of this Revision:February 10th 2026

Purpose:Modify the CarRecall application in chapter 4 Exercise 4 to allow the user to input as many model numbers as needed.
 
 
Author: Yemikael Melaku Berihun 
School: CHHS
Course: Computer Programming 20
 

*/package Mastery;

import java.util.Scanner;

public class CarRecall {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            int model = -1;  
            // Starting value so the loop runs at least once

            // PROCESSING LOOP
            // This loop keeps asking for model numbers until the user enters 0
            while (model != 0) {

                // INPUT SECTION
                // Ask the user for a car model number
                System.out.print("Enter the car's model number or 0 to quit: ");
                model = input.nextInt();

                // If the user enters 0, stop the program immediately
                if (model == 0) break;

                // PROCESSING SECTION
                // Check if the model number is one of the defective ones
                // This boolean becomes true ONLY if the model matches one of these values
                boolean bad = (model == 199 || model == 179 || model == 221 || model == 780);

                // OUTPUT SECTION
                // Print the correct message based on whether the car is defective
                if (bad)
                    System.out.println("Your car is defective. It must be repaired.");
                else
                    System.out.println("Your car is not defective.");
            }
        }
    }
}

/* Screen Dump
Enter the car's model number or 0 to quit: 473
Your car is not defective.
Enter the car's model number or 0 to quit: 0

 */