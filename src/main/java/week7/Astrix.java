package week7;

/**
 * @Author Sandeep Chanakya
 * *
 * **
 * ***
 * ****
 */
public class Astrix {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print("*");

            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
