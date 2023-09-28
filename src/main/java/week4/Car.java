package week4;
public class Car {
    int year; //constructor assigns default values for the instance variables

    void start() {
        int lclyear = 12;

        System.out.println("Instance variable " +year);
        System.out.println("Local variable " + lclyear);
    }

}
