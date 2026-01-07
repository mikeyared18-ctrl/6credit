package SkillBuilders;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a two-digit number: ");
        int number = input.nextInt();

        // Extract digits
        int ones = number % 10;      // remainder gives the ones place
        int tens = number / 10;      // integer division gives the tens place

        // Display results
        System.out.println("Tens place: " + tens);
        System.out.println("Ones place: " + ones);

        input.close();
    }
}
/* screenDump
 Enter a two-digit number: 85
Tens place: 8
Ones place: 5

*/