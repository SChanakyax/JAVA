package week7;

import java.util.Scanner;

/**
 * User enter 3 digit pwd
 * have to find the pwd what user has entered
 * 0-9
 * 0-9
 * 0-9
 */
public class Pwd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit password : ");
        String pwd = sc.nextLine();
        int iPwd = Integer.parseInt(pwd);


        //count the number of digits
        while (true) {
            if (pwd.length() > 3) {
                System.out.println("Enter 3 digit password : ");
                pwd = sc.nextLine();
                System.out.println(pwd.length());
            } else {
                break;
            }
        }

        //check for digits?
        for (int i = 0; i < pwd.length(); i++) {
            boolean flag = Character.isDigit(pwd.charAt(i));

            if (!(flag)) {
                System.out.println(" " + pwd.charAt(i) + " Is not a number. Please enter a 3digit pwd ");
            }
        }

        //find the numbers by each
        System.out.println(iPwd);

        boolean iFlag = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int t = i * 100 + j * 10 + k; //10th places
                    if (t == iPwd) {
                        System.out.println(t);
                        iFlag = true;
                        break;
                    }
                }
            }
        }

    }
}
