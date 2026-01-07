package SkillBuilders;

import java.util.Scanner;

public class RunningDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for race segment distances
        System.out.print("Enter distance of segment 1: ");
        double segment1 = input.nextDouble();

        System.out.print("Enter distance of segment 2: ");
        double segment2 = input.nextDouble();

        System.out.print("Enter distance of segment 3: ");
        double segment3 = input.nextDouble();

        // Prompt user for runner's name
        input.nextLine(); // consume newline
        System.out.print("Enter runner's name: ");
        String runnerName = input.nextLine();

        // Calculate total distance
        double totalDistance = segment1 + segment2 + segment3;

        // Display result
        System.out.println("\nRunner: " + runnerName);
        System.out.println("Total distance to run: " + totalDistance + " km");
    }
}

/* screenDump
 * Enter distance of segment 1: 12
Enter distance of segment 2: 10
Enter distance of segment 3: 5
Enter runner's name: spongebob

Runner: spongebob
Total distance to run: 27.0 km

 */

