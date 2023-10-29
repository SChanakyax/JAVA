package week11;

public class Shadowing2 {
}

class Driver1 {
    public static void main(String[] args) {
        Vehicle2 v2 = new Vehicle2();
        v2.print(90);
    }
}

class Vehicle2 {
    int x = 50, y = 60;

    void print(int y) {
        int x = 40;
        y = y;
        System.out.println(x + "   " + y);
        System.out.println(x + "   " + this.y);
    }
}