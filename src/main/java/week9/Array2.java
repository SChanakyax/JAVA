package week9;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        double num[][] = new double[5][3];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<num.length; i++){
            System.out.print("Enter numbers : ");
            num[i][0] = sc.nextInt();
            num[i][1] = num[i][0] * num[i][0];
            num[i][2] = Math.sqrt(num[i][0]);
           // System.out.println();
        }

        System.out.println("Printing numbers ");

        for (int p=0; p<num.length; p++){
            for (int q=1; q<=3; q++){
                System.out.print(num[p][q-1] +" " );
            }
            System.out.println();
        }

        System.out.println("Number\tSquare\tSquareRoot");
        for (int x=0;x<num.length; x++) {
            System.out.println((int)num[x][0]+"\t\t"+(int)num[x][1] +"\t\t"+ String.format("%.2f",num[x][2]));
        }
    }
}
