package week7;

public class AZZA {
    public static void main(String[] args) {

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.print(i);
            System.out.print("=>>>");
            System.out.print(j);
            System.out.println();
        }

        char c;

        //Print from A-Z
        for (int i = 65; i <= 90; i++) {
            c = (char) i;
            System.out.print(c);
        }

        System.out.println();

        for (int j = 90; j >= 65; j--) {
            c = (char) j;
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Using Char values");

        char s;

        for (s = 'A'; s <= 'Z'; s++) {
            System.out.print(s);
        }

        System.out.println();
        for (s = 'Z'; s >= 'A'; s--) {
            System.out.print(s);
        }

    }
}
