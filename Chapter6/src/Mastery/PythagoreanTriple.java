package Mastery;

public class PythagoreanTriple {

    public static void main(String[] args) {

        for (int a = 1; a < 100; a++) {
            for (int b = a; b < 100; b++) {   // start b at a to avoid duplicates
                double c = Math.sqrt(a * a + b * b);

                // Check if c is an integer and less than 100
                if (c == (int) c && c < 100) {
                    System.out.println("(" + a + ", " + b + ", " + (int)c + ")");
                }
            }
        }
    }
}
