package week7;

/**
 * @Author Sandeep Chanakya
 * <p>
 * This is to calculate factorials of 1 to 10
 */
public class Factorial {
    public static void main(String[] args) {

        int fact = 1;

        //calculate factorial
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
                System.out.print(j + " ");
            }

            System.out.println(" factorial of " + i + " " + fact);
            fact = 1;
        }
    }
}
