package week12;

/**
 * @Author Sandeep Chanakya
 * <p>
 * ObjectClass<-Shape<-Rectangle
 * <p>
 * week12.Shapex@568db2f2
 * week12.Rectangle@378bf509
 * <p>
 * packageName+ClassName+hexaDecimalHashCode
 * Java.lang.object has tostring method
 * <p>
 * When override the toString behaviour
 * RectangleClass Rectangle
 * <p>
 * immediate class has toString method Rectangle (without toString) will print the toString method in the Square class
 * becuse it extended from Square class
 */
public class Shapex implements Comparable {
    String name;

    public Shapex(String name) {
        this.name = name;
    }

    public void calculateArea() {
        System.out.println("Shape Area calculation method");
    }

    @Override
    public String toString() {
        return "Shapes" + name;
    }

    @Override
    public int compareTo(Object o) {
        return 1;

       /* if(id > o.id){
            return 1;
        } else if (id < o.id) {
            return -1;
        }else{
            return 0;
        }

        */
    }
}

class Square extends Shapex {

    public Square(String name) {
        super(name);
    }

    //Override the toString behaviour
    @Override
    public String toString() {
        return "SquareClass " + name;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Calculate area of the square ");
    }
}

class Rectangle extends Square {
    //If the Shape has the constructor subclasses has to create a constructor
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Rectangle area calculation method ");
    }
}

class X {

    public static void main(String[] args) {
        Shapex c = new Shapex("NEW SHAPE");
        Square s = new Square("Square");
        Rectangle r = new Rectangle("Rectangle");

        Shapex cx = c;

        System.out.println(s);
        System.out.println(c);
        System.out.println(r);

        System.out.println(c.equals(s)); //false
        System.out.println(r.equals(s));
        System.out.println(c.equals(cx));//default method of the equals is to check the reference here two objects refers to the same object


    }
}