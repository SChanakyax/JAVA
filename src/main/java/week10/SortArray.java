package week10;


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = {1,3,4,5,7,12,19,10,20,8,2};

        Arrays.sort(arr);

        for(int n : arr){
            System.out.println(n);
        }



    }
}
