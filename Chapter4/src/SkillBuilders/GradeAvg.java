package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
    	 try (Scanner input = new Scanner(System.in)) {
			double total = 0;
			int numGrades = 0;

			System.out.print("How many grades will you enter? ");
			numGrades = input.nextInt();

			// Enter grades and sum with +=
			for (int i = 1; i <= numGrades; i++) {
			    System.out.print("Enter grade " + i + ": ");
			    double grade = input.nextDouble();
			    total += grade;  // accumulate with +=
			}

			// Calculate average
			double average = total / numGrades;

			// Display formatted as percentage
			System.out.printf("Average grade: %.2f%%%n", average);
		 }
    }
}
/* ScreenDump
Enter the change in cents: 3646

The minimum number of coins is:
  Quarters: 145
  Dimes: 2
  Nickels: 0
  Pennies: 1

 */