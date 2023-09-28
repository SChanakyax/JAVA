package week3;

public class Increments {
    public static void main(String[] args) {
        postIncrement();
        preIncrement();

    }

    private static void postIncrement() {
        int x = 10;
        int y = x++;
        System.out.println("x - "+ x + " y - " + y);
        System.out.println();
    }

    private static void preIncrement() {
        int x = 10;
        int y = ++x;
        System.out.println("x - "+ x + " y - " + y);
        System.out.println(y);
    }

}
