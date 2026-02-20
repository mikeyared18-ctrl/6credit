package SkillBuilders;

import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			// INPUT
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			// PROCESSOR
			int sum = 0;

			for (int i = 1; i <= number; i++) {
			    if (i % 2 != 0) {   // odd check
			        sum += i;
			    }
			}

			// OUTPUT
			System.out.println("The sum of the odd numbers from 1 to " + number + " is: " + sum);
		}
    }
}

/*screen Dump
  Enter a number: 246
The sum of the odd numbers from 1 to 246 is: 15129 
*/
