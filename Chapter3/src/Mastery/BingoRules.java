/*
Program:BingoRules                                   		Date:11/26/2025 
Purpose:Create a BingoRules application that displays the rules for playing bingo.

Author: Yemikael-Berihun
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

public class BingoRules {
    public static void main(String[] args) {
        String[] rules = {
            "1. The caller randomly pulls a numbered bingo ball.",
            "2. The number is placed on the bingo board and called out.",
            "3. Players look for the called number on their bingo card.",
            "4. If the number is located, it is marked off.",
            "5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.",
            "6. The winning player yells BINGO."

        };
     

        for (String rule : rules) {
            System.out.println(rule);
            System.out.println(); // blank line between rules
        }
    }
}
/* ScreenDump
 * 1. The caller randomly pulls a numbered bingo ball.

2. The number is placed on the bingo board and called out.

3. Players look for the called number on their bingo card.

4. If the number is located, it is marked off.

5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.

6. The winning player yells BINGO.


 */
 


