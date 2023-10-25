package week9;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        int num[][] = new int[10][10];

        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i<num.length ; i++) {
            num[i][0] = sc.nextInt();
            for(int k =1; k < num.length; k++ ){
                num[i][k] = num[i][0];
                num[i][k] *= num[i][k-1];
            }
        }

        for(int j =0 ; j<num.length ; j++) {
            for(int k =1; k < num.length; k++ ){
                System.out.print(num[j][k] + "   ");
            }
            System.out.println();
        }
    }
}
