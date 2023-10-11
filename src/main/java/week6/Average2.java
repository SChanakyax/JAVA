package week6;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i =1, count=0,tot=0;

        System.out.println("i >> ");
        i = sc.nextInt();

        while(i>0) {
            tot+=i;
            count++;
            System.out.println("i >> ");
            i = sc.nextInt();

        }

        System.out.println(tot);
        System.out.println(count);

    }
}
