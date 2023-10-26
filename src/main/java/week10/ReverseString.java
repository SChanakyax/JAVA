package week10;

import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {

        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        char[] rev = new char[str.length()];

        for(int i=0; i<str.length();i++) {
            rev[i] = str.charAt(i);
            System.out.println(rev[i]);
        }

        for (int j=rev.length-1; j>=0; j--){
            System.out.print(rev[j]);
        }

    }
}
