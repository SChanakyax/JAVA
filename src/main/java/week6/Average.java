package week6;

import java.util.Scanner;

/**
 * @Author Sandeep Chanakya
 * Enter 10 positive numbers ignore negative numbers
 * calculate tot,avg,max
 */
public class Average {

    public static void main(String[] args) {
        int i = 1, total = 0;

        Scanner sc = new Scanner(System.in);

        while(i<=10){
            System.out.println("Enter number " + i);
            int input = sc.nextInt();
           // total = input + total;
            if(!(input < 0)){
                i++;
                total += input;
            }
        }

        System.out.println(total);
        System.out.println(total/10);
        System.out.println();

        int x = 1;
        while(x>0){
            System.out.println("XXXXX");
        }

    }
}
