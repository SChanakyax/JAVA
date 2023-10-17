package week7;

public class Pattern1 {
    public static void main(String[] args) {

        System.out.println("star patterns");

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println();
        for (int i = 0; i <= 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
