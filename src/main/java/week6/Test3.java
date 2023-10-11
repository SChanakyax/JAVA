package week6;

import java.util.Scanner;

/**
 * @Author Sandeep
 * enum - predefined set of values
 * inside class or outside classes
 */

enum Color {RED, BLUE, WHITE}

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Enter color : ");

        Color clr = Color.BLUE;
        Size sz = Size.L;

        switch (clr) {
            case BLUE:
                System.out.println("Its Hot");
                break;
            case WHITE:
                System.out.println("Its cool");
                break;
            case RED:
                System.out.println("Usual weather");
                break;
            default:
                System.out.println("Irreverent color");
        }
    }

    enum Size {S, M, L, XL}
}
