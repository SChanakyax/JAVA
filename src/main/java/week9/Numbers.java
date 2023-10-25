package week9;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[10];
        int input, total =0,avg =0;
        int max = numbers[0], min = numbers[0];

        System.out.println("Enter 10 values : ");

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            input = sc.nextInt();
            if(input>100){
                System.out.println("Enter a number less than 100 ");
                i--;
            } else if (input < 0) {
                System.out.println("Enter a positive number ");
                i--;
            }else {
                numbers[i] = input;
            }

        }

        for(int num : numbers){
            System.out.print(num+ " ");
            total += num;
        }

        for (int j = 0; j< numbers.length ; j++){
            if(numbers[j] > max) {
                max= numbers[j];
            }

            if (numbers[j] < min){
                min= numbers[j];
            }
        }

        System.out.println("Total of the numbers : " + total);
        System.out.println("Average : " + (total/numbers.length));
        System.out.println("Maximum :  " + max);
        System.out.println("Minimum : " + min);

    }
}
