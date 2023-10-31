package week12;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise1 {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();

        name.add("Zeebra");
        name.add("Kamal");
        name.add("Ruwan");
        name.add("Apple");

        System.out.println("Size of the arrayList : " + name.size());
        Collections.sort(name);

        for (String n : name) {
            System.out.println(n);
        }

        //For shapes

        ArrayList<Shapex> shape = new ArrayList<>();

        //Have to create shapes on before adding to the shape arrayList
        Shapex s1 = new Shapex("Rectangle");
        Shapex s2 = new Shapex("Circle");
        Shapex s3 = new Shapex("Cube");

        shape.add(s1);
        shape.add(s2);
        shape.add(s3);

        Collections.sort(shape);// cannot be used as we use reference type variable

        //Sort Objects ****
        /*
        comparable interface - used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only  (shape class is a custom class have to implement comparable interface and have to override compareTo method)
        comparator interface - Java Comparator interface is used to order the objects of a user-defined class. This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).It provides multiple sorting sequences
         */

        for (Shapex s : shape) {
            System.out.println(s);
            //To get a meaningful output have to use toString method in the Shapex Class
        }

    }
}
