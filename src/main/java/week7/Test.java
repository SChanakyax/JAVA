package week7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int pTotal = 0, nTotal = 0, countZero = 0, input, max = 0, min = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            input = sc.nextInt();

            if (input > 0) {
                pTotal += input;
            } else if (input < 0) {
                nTotal += input;
            } else if (input == 0) {
                countZero++;
            }

            if (input > max) {
                max = input;
            } else if (input < min) {
                min = input;
            }
        }

        System.out.println("Total of positive numbers " + pTotal);
        System.out.println("Sum of negative numbers " + nTotal);
        System.out.println("Max value " + max);
        System.out.println("Min value " + min);
        System.out.println("Number of zero inputs " + countZero);

    }
}
