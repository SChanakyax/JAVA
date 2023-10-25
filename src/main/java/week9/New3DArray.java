package week9;

public class New3DArray {

    public static void main(String[] args) {

        int [][][] arr = { {{2,3}, {3,4}} , {{9,4},{4,4}}};


        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++) {
                for (int k=0; k<2; k++){
                    System.out.print(arr[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
