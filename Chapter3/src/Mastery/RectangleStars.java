/*
Program:RectangleStars    		Date:11/26/2025 
Purpose: Create a Rectangle application that displays a rectangle of asterisks (*).


Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

public class RectangleStars {
    public static void main(String[] args) {
        int width = 15;
        int height = 7;

        for (int row = 0; row < height; row++) {
            if (row == 0 || row == height - 1) {
                // Top or bottom row
                for (int col = 0; col < width; col++) {
                    System.out.print("*");
                }
            } else {
                // Middle rows
                System.out.print("*"); // Left border
                for (int col = 0; col < width - 2; col++) {
                    System.out.print(" ");
                }
                System.out.print("*"); // Right border
            }
            System.out.println();
        }
    }
}
/* ScreenDump
 
***************
*             *
*             *
*             *
*             *
*             *
***************

 */
