package week12;

class ShapeCalculator {

    public static void main(String[] args) {


    }

    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(float base, double height) {
        return (base / 2) * height;
    }

    public double calculateArea(double height) {
        return height * height;
    }
}

public class Testx {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();

        double circleArea = sc.calculateArea(5.0f);
        double square = sc.calculateArea(5.0);
        double rectangleArea = sc.calculateArea(4.0, 6.0);


        System.out.println(circleArea);
        System.out.println(square);
        System.out.println(rectangleArea);
    }
}




