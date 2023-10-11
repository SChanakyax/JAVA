package week6;

import java.util.Scanner;

/**
 * @Author Sandeep Chanakya
 * Finding if 1st character is a vowel sound
 */
public class Test2 {

    public static String text = "This is a vowel sound";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input : ");
        String input = sc.nextLine();

        char s = input.charAt(0);

        switch (s) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'u':
            case 'U':
                System.out.println(text);
                break;
            default:
                System.out.println("This is not vowel sound !");

        }


    }
}