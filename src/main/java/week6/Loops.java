package week6;

public class Loops {
    public static void main(String[] args) {
        int i = 1;

        while(i<=10){
            System.out.println(i);
            i++;
        }

        evenNumbers();

    }

    public static void evenNumbers(){
        int i = 0;

        while(i <= 10){
            if(i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
