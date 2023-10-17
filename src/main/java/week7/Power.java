package week7;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        System.out.println("Enter number Base : ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter number Power : ");
        int power = sc.nextInt();
        int r = 1;

        for (int i = 1; i <= power; i++) {
            r = r * base;
        }
        System.out.println(r);

    }
}
