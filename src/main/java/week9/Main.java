package week9;

public class Main {

    public static void main(String[] args) {

        String names[] = new String[10];

        String nameArr[] = {"Ann", "Kamal", "Saman", "Ruwan"};

        for(int i=0; i< nameArr.length;i++){
            System.out.println(nameArr[i]);
        }

        System.out.println();

        for (String n : nameArr) {
            System.out.println(n);
        }

    }
}
