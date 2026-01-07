/*
Program:projectTimeAnalyzer                                   		Date:12/26/2025 
Purpose:Create a Project application to help analyze the time taken for a Java project

Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class ProjectTimeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for time spent on each task
        System.out.println("Enter the number of minutes spent on each of the following project tasks:");

        System.out.print("Designing: ");
        double designing = scanner.nextDouble();

        System.out.print("Coding: ");
        double coding = scanner.nextDouble();

        System.out.print("Debugging: ");
        double debugging = scanner.nextDouble();

        System.out.print("Testing: ");
        double testing = scanner.nextDouble();

        // Calculate total time
        double totalTime = designing + coding + debugging + testing;

        // Calculate percentages
        double designingPercent = (designing / totalTime) * 100;
        double codingPercent = (coding / totalTime) * 100;
        double debuggingPercent = (debugging / totalTime) * 100;
        double testingPercent = (testing / totalTime) * 100;

        // Display results
        System.out.println("\nTask         % Time");
        System.out.printf("Designing    %.2f %%\n", designingPercent);
        System.out.printf("Coding       %.2f %%\n", codingPercent);
        System.out.printf("Debugging    %.2f %%\n", debuggingPercent);
        System.out.printf("Testing      %.2f %%\n", testingPercent);

        scanner.close();
    }
}

/* screenDump
 * Enter the number of minutes spent on each of the following project tasks:
Designing: 500
Coding: 350
Debugging: 100
Testing: 50

Task         % Time
Coding       35.00 %
Debugging    10.00 %
Testing      5.00 %*/
 