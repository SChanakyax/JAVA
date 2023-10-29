package week11;

public class VehicleX {
    static int x = 90;
    int y = 100;

    VehicleX(int x, int y) {
        VehicleX.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("x = " + x + " y= " + y);
    }

}


class Tests {
    public static void main(String[] args) {

        VehicleX v1 = new VehicleX(10, 20);
        VehicleX v2 = new VehicleX(15, 35);
        VehicleX v3 = new VehicleX(55, 98);

        //the static variable last it will set to 55
        v1.print();
        v2.print();
        v3.print();

        //VehicleX.print(); ClassName.method name -> if the method is static void print(){}; and has no non static var values
    }
}
