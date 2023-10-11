package week6;

import java.util.Scanner;

public class Decision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid character");
        }

        if (input == 1) {
            System.out.println("Monday");
        } else if (input == 2) {
            System.out.println("Tuesday");
        } else if (input == 3) {
            System.out.println("Wednesday");
        } else if (input == 4) {
            System.out.println("Thursday");
        } else if (input == 5) {
            System.out.println("Friday");
        } else if (input == 6) {
            System.out.println("Saturday");
        } else if (input == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong input !");
        }

    }

}
