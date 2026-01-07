package SkillBuilders;

import java.util.Scanner;

public class CircleCircumference {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare constant for PI
        final double PI = 3.14159;

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate circumference
        double circumference = 2 * PI * radius;

        // Display result
        System.out.println("The circumference of the circle is: " + circumference);

        // Close scanner
        input.close();
    }
}
/* ScreenDump
Enter the radius of the circle: 44
The circumference of the circle is: 276.45992
 */