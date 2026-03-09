package Mastery;
import java.util.Scanner;

public class IsoTriangle {

    // OUTPUT helper method
    // This method prints a row of stars based on numStars
    public static void drawBar(int numStars) {
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");   // prints stars without a newline
        }
        System.out.println();        // moves to the next line after printing stars
    }

    // PROCESSING helper method
    // This method prints spaces before the stars to center the triangle
    public static void addSpaces(int numSpaces) {
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");   // prints spaces to shift stars to the right
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // INPUT SECTION
        // Ask the user how big the triangle should be
        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();   // user enters the number of rows

        // PROCESSING + OUTPUT SECTION
        // Loop through each row of the triangle
        for (int row = 1; row <= size; row++) {

            // PROCESSING: calculate how many spaces and stars each row needs
            int spaces = size - row;        // spaces decrease as row increases
            int stars  = 2 * row - 1;       // stars increase by 2 each row

            // OUTPUT: print the spaces first, then the stars
            addSpaces(spaces);              // shifts the stars to the center
            drawBar(stars);                 // prints the actual stars
        }

        scanner.close(); // closes the scanner to prevent memory leaks
    }
}
