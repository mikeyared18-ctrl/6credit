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
        

        // INPUT
        int maxBase = 10;
        int maxPower = 10;

        // OUTPUT (top header with × symbol)
        System.out.print("      ");
        for (int p = 1; p <= maxPower; p++) {
            System.out.printf("%10s", p + "×");
        }
        System.out.println();

        // PROCESSOR + OUTPUT (table body)
        for (int base = 1; base <= maxBase; base++) {

            // left column
            System.out.printf("%-6d", base);

            for (int power = 1; power <= maxPower; power++) {
                long value = (long) Math.pow(base, power);
                System.out.printf("%10d", value);
            }

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