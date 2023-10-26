package week10;

public class Substrings {

    public static void main(String[] args) {

        String itNo = "IT19122145";

        String it = itNo.substring(0,2);
        String year = itNo.substring(2,4);
        String fac = itNo.substring(4,8);
        String index = itNo.substring(8,10);
        System.out.println(it + " " + year + " " + fac + " " + index);
    }
}
