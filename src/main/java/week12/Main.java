package week12;

class Shape {

    public void calculateArea() {
        System.out.println("Area calculator method >> ");
    }

}

class Circle extends Shape {

    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Area of a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
    }
}


