package SkillBuilders;

import java.util.Scanner;

public class GradeAvg2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;    // will store the sum of all grades
        int numberOfGrades = 0;

        System.out.print("How many grades will you enter? ");
        numberOfGrades = input.nextInt();

        // Loop to enter each grade
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = input.nextDouble();

            total += grade;  // Using += to accumulate grades
        }

        // Calculate average
        double average = total / numberOfGrades;

        // Display as percentage (2 decimal places)
        System.out.printf("The average grade is: %.2f%%\n", average);

        input.close();
    }
}
/* ScreenDump
How many grades will you enter? 4
Enter grade 1: 33
Enter grade 2: 56
Enter grade 3: 67
Enter grade 4: 88
The average grade is: 61.00%

 */