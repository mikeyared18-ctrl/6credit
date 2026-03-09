/*

Program:PowerTable.java          Last Date of this Revision:February 10th 2026

Purpose:Create a powersTable application that displays tables of powers 
 

Author: Yemikael Melaku Berihun 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;

public class PowerTable {

    public static void main(String[] args) {
        
        // INPUT SECTION
        // These two variables control how big the table will be.
        // maxBase = how many rows (bases 1 to 10)
        // maxPower = how many columns (powers 1 to 10)
        int maxBase = 10;
        int maxPower = 10;

        // OUTPUT SECTION (HEADER)
        // This prints the top row of the table showing the power values (1×, 2×, 3×, ...)
        System.out.print("      ");  // spacing before the header row
        for (int p = 1; p <= maxPower; p++) {
            System.out.printf("%10s", p + "×");  // prints each power label aligned in columns
        }
        System.out.println();  // move to next line after header

        // PROCESSING + OUTPUT SECTION (TABLE BODY)
        // Outer loop: goes through each base number (1 to 10)
        for (int base = 1; base <= maxBase; base++) {

            // OUTPUT: print the base number on the left side of the row
            System.out.printf("%-6d", base);

            // Inner loop: calculates base^power for each power from 1 to 10
            for (int power = 1; power <= maxPower; power++) {

                // PROCESSING: calculate the value using Math.pow()
                // Math.pow(base, power) returns a double, so we cast it to long
                long value = (long) Math.pow(base, power);

                // OUTPUT: print the calculated value in a nicely aligned column
                System.out.printf("%10d", value);
            }

            // OUTPUT: move to the next row after finishing one full line of powers
            System.out.println();
        }
    }
}

/* Screen Dump

1×        2×        3×        4×        5×        6×        7×        8×        9×       10×
1              1         1         1         1         1         1         1         1         1         1
2              2         4         8        16        32        64       128       256       512      1024
3              3         9        27        81       243       729      2187      6561     19683     59049
4              4        16        64       256      1024      4096     16384     65536    262144   1048576
5              5        25       125       625      3125     15625     78125    390625   1953125   9765625
6              6        36       216      1296      7776     46656    279936   1679616  10077696  60466176
7              7        49       343      2401     16807    117649    823543   5764801  40353607 282475249
8              8        64       512      4096     32768    262144   2097152  16777216 1342177281073741824
9              9        81       729      6561     59049    531441   4782969  43046721 3874204893486784401
10            10       100      1000     10000    100000   1000000  10000000 100000000100000000010000000000

 */