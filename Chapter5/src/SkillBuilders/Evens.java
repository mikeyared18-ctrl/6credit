package SkillBuilders;

public class Evens {

    public static void main(String[] args) {

        // INPUT
        int start = 1;
        int end = 20;

        // PROCESSOR + OUTPUT
        for (int num = start; num <= end; num++) {

            // PROCESSOR
            boolean isEven = (num % 2 == 0);

            // OUTPUT
            if (isEven) {
                System.out.println(num);
            }
        }
    }
}
/*screen Dump
 2
4
6
8
10
12
14
16
18
20 */
 