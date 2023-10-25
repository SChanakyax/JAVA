package week9;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        int [] arr = {2,12,3,4,5,78,55};
        int number;

        System.out.println("The current Array : ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        System.out.print("\nEnter a number to replace in the array : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i=0; i<arr.length; i++) {
            if(arr[i] == number){
                arr[i] = -1;
                break;

            }
        }

        System.out.println("Changed Array : ");
        for(int n : arr){
            System.out.print(n + " ");
        }

    }
}
