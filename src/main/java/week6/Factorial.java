package week6;


import java.util.Scanner;

/**
 * @Author Sandeep Chanakya
 * Enter a number and calculate the factorial
 */
public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial =1, n =1;

        while(n<=number){
            factorial = factorial * n;
            n++;
        }

        System.out.println(factorial);
    }
}
