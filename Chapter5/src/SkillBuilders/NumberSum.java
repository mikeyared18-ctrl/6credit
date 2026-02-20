package SkillBuilders;

import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			// INPUT
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			// PROCESSOR
			int sum = 0;

			// OUTPUT 
			for (int i = 1; i <= number; i++) {
			    System.out.println(i);
			    sum += i;
			}

			// OUTPUT (sum)
			System.out.println("The sum is: " + sum);
		}
    }
}
