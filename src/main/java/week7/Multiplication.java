package week7;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        System.out.println("Enter number to get multiplication table : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + i + " ==> " + (number * i));
        }
    }
}
