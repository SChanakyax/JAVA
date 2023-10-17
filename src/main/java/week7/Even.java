package week7;

public class Even {
    public static void main(String[] args) {

        System.out.println("Printing Even Numbers : ");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);

        }
    }
}
