package week3;

public class CastingChars {

    public static void main(String[] args) {
        int x = 99;
        char ch = (char) x;
        System.out.println(ch);

        char chr = 'X';
        System.out.println((int)chr);

        //Character escape sequences
        System.out.println("Hello \"Saman\" , \'How are you ? \' \n" +
                "\'What are you doing these days? Reading?\\Jogging?\\Working?\'" +
                "\n Kamala said that \"Saman is working now.\" \f");

        System.out.println("Student Info \n" + "Name \t ID \n" +
                "\"Jane\" \t 101 \n" +
                "\"Doe\"  \t 102 \n" +
                "\"N\\A\" \t 103 \n");
    }

}
