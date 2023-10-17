package week8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student std = new Student();

        std.age = 20;
        std.name = "Dana";
        std.sid = "123CRV";

        std.printData();

        Vehicle car = new Vehicle();
        car.setBrand("Toyota");
        car.setType("CAR");
        car.setvId("CGM-2345");

        System.out.println(car.getBrand() + " " + car.getType() + " " + car.vId);

        Calculation cal = new Calculation();
        System.out.println(cal.cal_Add(5, 5));
        System.out.println(cal.cal_Diff(5, 5));
        System.out.println(cal.cal_Mul(5, 5));
        System.out.println(cal.cal_Div(5, 6));

        int i = 0;
        Scanner sc = new Scanner(System.in);

        StudentX s = new StudentX("Kumara", "1233IIT");
        int[] marks = new int[4];

        for (i = 0; i < 4; i++) {
            System.out.println("Enter Subjects : ");
            s.setSubject(sc.nextLine());

            System.out.println("Enter Grades : ");
            marks[i] = sc.nextInt();
        }

        s.printInfo(s.calGrade(marks[0], marks[1], marks[2], marks[3]));

        StudentX.print();
    }
}
