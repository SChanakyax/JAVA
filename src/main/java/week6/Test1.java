package week6;

import java.util.Scanner;

/**
 * @Author Sandeep Chanakya
 * 0,1,2,3 - low
 * 4,5,6 - average
 * 7,8 - above average
 * 9,10 - high
 */
public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input >= 0 && input < 4) {
            System.out.println("low");
        } else if (input >= 4 && input < 7) {
            System.out.println("average");
        } else if (input >= 7 && input < 9) {
            System.out.println("above average");
        } else if (input >= 9 && input < 10) {
            System.out.println("high");
        } else {
            System.out.println("Invalid");
        }

        switch (input) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("low");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("average");
                break;
            case 7:
            case 8:
                System.out.println("above average");
                break;
            case 9:
            case 10:
                System.out.println("high");
                break;
            default:
                System.out.println("Enter a valid number between 1-10");
        }
    }
}
