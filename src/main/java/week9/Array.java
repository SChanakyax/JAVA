package week9;

public class Array {

    public static void main(String[] args) {
        int numbers[][] = new int[3][2];

        numbers[0][0] = 2;
        numbers[0][1] = 4;
        numbers[1][0] = 3;
        numbers[1][1] = 6;
        numbers[2][0] = 8;

        System.out.println(numbers[0].length);

        for(int i = 0; i<numbers.length ; i++) {
            System.out.println(numbers[i][0] + " " + numbers[i][1]);
        }

    }
}

