package Mastery;
import java.util.Scanner;

public class IsoTriangle {

    public static void drawBar(int numStars) {
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void addSpaces(int numSpaces) {
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++) {
            int spaces = size - row;
            int stars  = 2 * row - 1;
            addSpaces(spaces);
            drawBar(stars);
        }

        scanner.close();
    }
}