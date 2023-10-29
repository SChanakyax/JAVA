package week11;

public class StaticCls {

    static void start() {
        System.out.println("Starting the vehicle...");
    }
}

class Car1 extends StaticCls {
    void stop() {
        System.out.println("Stopping the vehicle....");
    }
}

class SportsCar1 extends Car {

    void race() {
        System.out.println("Countdown 3 2 1");
    }


}

class Test {
    public static void main(String[] args) {
        StaticCls.start();// as methods are static no need to make object
    }
}