package week3;

/**
 * Dynamic initialization
 * Here Volume variable is initialized during the runtime
 */

public class DynInit {

    public static void main (String[] args) {
        double radius = 4, height = 5;

        //dynamically initialize volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
