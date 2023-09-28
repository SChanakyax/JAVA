package week5;

import week5.student.Student;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Student std = new Student();
        std.hello();
        //System.out.print();

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name : " + name);
    /* String - next() / nextLine()
        boolean - nextBoolean()
        byte - nextByte()
        short - nextShort()
        int - nextInt()
        long = nextLong()
        float - nextFloat()
        double - nextDouble()
     */

        //Number is even or odd
        System.out.println("Enter a number >>>");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        if (n % 2 == 0) {
            System.out.println("Number is POSITIVE & EVEN number");
        } else {
            System.out.println("Number is ODD number");
        }

    }
}
