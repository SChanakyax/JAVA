package week11;

public class Vehicle {

    void start() {
        System.out.println("Starting the vehicle...");
    }
}

class Car extends Vehicle {
    void stop() {
        System.out.println("Stopping the vehicle....");
    }
}

class SportsCar extends Car {

    void race() {
        System.out.println("Countdown 3 2 1");
    }
}
