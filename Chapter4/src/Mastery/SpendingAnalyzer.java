/*
Program:SpendingAnalyzer                                   		Date:12/26/2025 
Purpose:Create a Spending application to help examine the spending patterns of a user. 

Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;
import java.util.Scanner;

public class SpendingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for spending amounts
        System.out.println("Enter the amount spent last month on the following items:");

        System.out.print("Food: $");
        double food = scanner.nextDouble();

        System.out.print("Clothing: $");
        double clothing = scanner.nextDouble();

        System.out.print("Entertainment: $");
        double entertainment = scanner.nextDouble();

        System.out.print("Rent: $");
        double rent = scanner.nextDouble();

        // Calculate total spending
        double total = food + clothing + entertainment + rent;

        // Calculate percentages
        double foodPercent = (food / total) * 100;
        double clothingPercent = (clothing / total) * 100;
        double entertainmentPercent = (entertainment / total) * 100;
        double rentPercent = (rent / total) * 100;

        // Display results
        System.out.println("\nCategory        Budget");
        System.out.printf("Food            %.2f %%\n", foodPercent);
        System.out.printf("Clothing        %.2f %%\n", clothingPercent);
        System.out.printf("Entertainment   %.2f %%\n", entertainmentPercent);
        System.out.printf("Rent            %.2f %%\n", rentPercent);

        scanner.close();
    }
}
/*ScreenDump
 Enter the amount spent last month on the following items:
Food: $500
Clothing: $200
Entertainment: $159
Rent: $2350

Category        Budget
Food            15.58 %
Clothing        6.23 %
Entertainment   4.95 %
Rent            73.23 %
*/
 