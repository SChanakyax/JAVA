package week7;

import java.util.Scanner;

/**
 * @Author Sandeep Chanakya
 * Calculate sum of number from 1 to 100
 */
public class ForLoops {

    public static void main(String[] args) {

        int count = 0, total = 0;
        int input = 0;

        for (int i = 0; i <= 100; i++) {
            count += i;
        }

        System.out.println(count);

        Scanner sc = new Scanner(System.in);
        for (int j = 1; j <= 10; j++) {
            System.out.println("Enter number : " + j);
            input = sc.nextInt();
            if (input > 0) {
                total += input;
            } else {
                j--;
            }
        }
        System.out.println(total);
    }
}

