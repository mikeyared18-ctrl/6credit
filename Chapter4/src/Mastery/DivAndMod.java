/*
Program:DivAndMod                                   		Date:12/26/2025 
Purpose:Create a DivAndMod application that prompts the user for two integers and then displays the result of 
integer and modulus division in either order. 

Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class DivAndMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for two integers
        System.out.print("Enter an integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter a second integer: ");
        int second = scanner.nextInt();

        // Perform integer and modulus division
        System.out.println();
        System.out.println(first + " / " + second + " = " + (first / second));
        System.out.println(first + " % " + second + " = " + (first % second));
        System.out.println();
        System.out.println(second + " / " + first + " = " + (second / first));
        System.out.println(second + " % " + first + " = " + (second % first));

        scanner.close();
    }
}
/* ScreenDump 
  Enter an integer: 57
Enter a second integer: 12

57 / 12 = 4
57 % 12 = 9

12 / 57 = 0
12 % 57 = 12
 */