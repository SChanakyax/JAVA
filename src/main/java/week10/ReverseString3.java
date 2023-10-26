package week10;

import java.util.Scanner;

public class ReverseString3 {

    public static String reverse(String str)
    {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args)
    {
        String original = "Hello, world!";
        String reversed = reverse(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}
