package week11;

enum VType {BIG, SMALL}//predefined set of values - constant values

public class enum_ {

    public static void main(String[] args) {

        VehicleR r = new VehicleR();
        r.model = "Sports car";
        r.type = VType.BIG;
        r.clr = VehicleR.Color.BLUE;
        r.print();
    }


}

class VehicleR {

    String model;
    VType type;
    Color clr;

    void print() {
        System.out.println(type + " " + model + " " + clr);
    }

    enum Color {RED, BLACK, BLUE}

}