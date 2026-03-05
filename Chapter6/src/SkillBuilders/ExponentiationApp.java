package SkillBuilders;

import java.util.Scanner;

public class ExponentiationApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        int result = powerOf(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    public static int powerOf(int e, int p) {
        int total = 1;

        for (int i = 1; i <= p; i++) {
            total = total * e;
        }

        return total;
    }
}

