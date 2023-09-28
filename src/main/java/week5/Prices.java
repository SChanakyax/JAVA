package week5;

import java.util.Scanner;

public class Prices {

    public static void main(String[] args) {
        System.out.println("Enter the price >>>");
        Scanner p = new Scanner(System.in);
        double price = p.nextDouble();

        System.out.println("Enter the quantity >>>");
        Scanner q = new Scanner(System.in);
        int quantity = q.nextInt();

        double total = 0;

        if (quantity >= 0) {
            if (quantity > 1000) {
                total = (price * quantity) * 90 / 100;
            } else if (quantity > 500) {
                total = (price * quantity) * 95 / 100;
            } else {
                total = price * quantity;
            }
        }
        System.out.println("Enter Total price >>> " + total);

    }

}
