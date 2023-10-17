package week8;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        System.out.println("Array is a collection of variables to store many values");

        int num[] = new int[10];
        int []val = new int[10];

        num[0] = 0;
        num[1] = 10;
        num[2] = 20;
        num[3] = 30;
        num[4] = 40;
        num[5] = 50;
        num[6] = 60;
        num[7] = 70;
        num[8] = 80;
        num[9] = 90;

        System.out.println("Array size " + num.length);

        for (int i = 0; i < num.length; i++) {
            System.out.println("num " + i + " >> " + num[i]);
        }

        int arr[] = {2,4,6,8,10};
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter 5 values");
        Scanner sc = new Scanner(System.in);
        int inputs[] = new int[5];
        int total =0;

        System.out.println(inputs.length);
        for (int i = 0; i<5; i++ ) {
            System.out.print("Enter number " + (i+1)+ " : ");
            inputs[i] = sc.nextInt();
            total += inputs[i];

        }

        for (int i : inputs){
            System.out.print(i + " ");
        }

        System.out.println("\n" + total);
    }
}
