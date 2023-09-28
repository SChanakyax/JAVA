package week4;

public class Driver {

    int age; //instance variable
    String name;

    public static void main(String[] args) {
        int num=12; //local variable (has to be initialized before use)

        Car c = new Car();
        c.start();

        Driver d = new Driver();
        System.out.println(d.name); //null will be printed

        //var year =10; //var can only be used inside method - this can be used for premitive or reference types - from Java 10
        //If use var it will change the type based on the value assigned.
        //var year = null , cant initialize null values
        //year = 5000;
       // System.out.println(year);


        System.out.println(new Driver().age);
        System.out.println(num);
    }

}
