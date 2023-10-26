package week9;

import java.util.Scanner;

public class ArrSqCube {
    public static void main(String[] args) {

        int numbers[][] = new int[5][5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Numbers >>> ");

    /*    for (int j=0;j<numbers.length; j++){
         //   System.out.println(numbers[j][0]);
            numbers[j][1] = numbers[j][0] * numbers[j][0];
            numbers[j][2] = numbers[j][1] * numbers[j][0];

            System.out.println(numbers[j][0] + " " + numbers[j][1] + " " + numbers[j][2]);
          //  System.out.println(numbers[j][0] + " " + numbers[j][1]);
        }

     */
        for (int j=0;j<numbers.length; j++){

            System.out.println("Enter Numbers : ");
            numbers[j][0] = sc.nextInt();

            for (int k = 1; k<numbers.length; k++ ){
                numbers[j][k] = numbers[j][0];
                numbers[j][k] *= numbers[j][k-1];
            }
        }

        for (int x=0; x<numbers.length;x++) {
            for (int y=0; y<5; y++){
                System.out.print(numbers[x][y] + " ");
            }

            System.out.println();
        }

    }
}
