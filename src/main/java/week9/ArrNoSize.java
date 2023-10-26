package week9;

public class ArrNoSize {
    public static void main(String[] args) {

        int[][] num ={ {1,2,3,4,5},{4,5,6,7}};

        for (int i=0; i<num.length; i++) {
            for (int j=0; j<num[0].length;j++){
                System.out.print(num[i][j] + "\t");
            }
            System.out.println(" ");
        }

        String numX[][] ={ {"1","2","3","4","5"},{"4","5","6","7"}};

        for (int i=0; i<numX.length; i++) {
            for (int j=0; j<numX[0].length;j++){
                System.out.print(numX[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}
