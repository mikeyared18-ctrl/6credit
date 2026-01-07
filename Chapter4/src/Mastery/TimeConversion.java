/*
Program:TimeConversion		Date:11/26/2025 
Purpose:Create a TimeConversion application that prompts the user for a time in minutes and then displays 
the time in hours and minutes.
Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for time in minutes
        System.out.print("Enter the time in minutes: ");
        int totalMinutes = scanner.nextInt();

        // Convert to hours and minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Format minutes to always show two digits
        String formattedMinutes = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);

        // Display result
        System.out.println("The time is: " + hours + ":" + formattedMinutes);

        scanner.close();
    }
}
/*ScreenDump
 Enter the time in minutes: 464
The time is: 7:44
*/
 