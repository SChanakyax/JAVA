package week11;

public class Driver {
    public static void main(String[] args) {

        SportsCar sc = new SportsCar();
        sc.start();
        sc.race();
        sc.stop();

        System.out.println(sc.getClass().getSuperclass());

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.getClass().getSuperclass());
    }
}
