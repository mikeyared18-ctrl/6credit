/*
Program:SleepCalculator                                   		Date:12/26/2025 
Purpose:Create a Sleep application that calculates the number of hours of your life that you have spent sleeping.
Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class SleepCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get birthdate
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Month: ");
        int birthMonth = scanner.nextInt();
        System.out.print("Day: ");
        int birthDay = scanner.nextInt();

        // Get current date
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Month: ");
        int currentMonth = scanner.nextInt();
        System.out.print("Day: ");
        int currentDay = scanner.nextInt();

        // Calculate total days alive
        int yearsAlive = currentYear - birthYear;
        int monthsAlive = currentMonth - birthMonth;
        int daysAlive = currentDay - birthDay;

        // Adjust for negative values
        if (daysAlive < 0) {
            daysAlive += 30;
            monthsAlive--;
        }
        if (monthsAlive < 0) {
            monthsAlive += 12;
            yearsAlive--;
        }

        int totalDaysAlive = yearsAlive * 365 + monthsAlive * 30 + daysAlive;
        int totalHoursSlept = totalDaysAlive * 8;

        // Output results
        System.out.println("You have been alive for " + totalDaysAlive + " days.");
        System.out.println("You have slept " + totalHoursSlept + " hours.");

        scanner.close();
    }
}
/*screeDump
 * Enter your birthdate:
Year: 2008
Month: 12
Day: 5
Enter today's date:
Year: 2025
Month: 12
Day: 8
You have been alive for 6208 days.
You have slept 49664 hours.
 */