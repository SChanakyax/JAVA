package week5;

public class Test {

    public static void main(String[] args) throws Exception {
        /* This throws an error System.in.read() returns integer.
        System.out.println("Input >>");
        byte b = System.in.read(); will read the next byte
        System.out.println(b);
         */

        System.out.println("Input >>");
        char b = (char) System.in.read();
        System.out.println(b);

        System.out.println("Input >>");
        int i = System.in.read();
        System.out.println(i);

        byte[] x = new byte[10];
        System.out.println("Input >>");
        System.in.read(x);
        String s = new String(x);
        System.out.println(s);
    }
}
