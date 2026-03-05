package SkillBuilders;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Correct conversion formula
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Display the result
        System.out.println("The temperature in Celsius is: " + celsius);

        input.close();
    }
}

/* ScreenDump
Enter temperature in Fahrenheit: 99
The temperature in Celsius is: 37.22222222222222
 */
