package week10;

import java.util.Scanner;

public class VowelsConsonent {
    public static void main(String[] args) {

        int vowel = 0,cons = 0;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();


        for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                   vowel += 1;
           }else
               cons += 1;
        }

        System.out.println("Number of vowels : " + vowel);
        System.out.println("Number of Consonents : " + cons);
    }
}
