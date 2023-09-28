package week3;

public class Calc {
    public static void main(String[] args) {

        double x = 10.4;
        x /= 4 + 2 * 2; // x = x/(4 + 2 * 2)
        System.out.println(x);

        int a,b,c;
        a = b = c = 5;
        int exp = a + b++ + ++c;
        System.out.println(exp);

        exp = 10;
        a = b = 5;
        exp += ++a * b++; // exp = exp + 6 * 5
        System.out.println(exp);
    }
}
