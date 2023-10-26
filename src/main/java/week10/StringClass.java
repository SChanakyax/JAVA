package week10;

/**
 * String are immutable objects
 * JVM has a special area called 'String constant pool'
 *
 * String class is final - once created cant change but will create a reference
 *
 */
public class StringClass {
    public static void main(String[] args) {

        String x;
        x = "ABC";

        String y = "DEF";

        String z = new String();

        String q = new String();
        q = "12345";

        String a = new String("Hello World ! ");

        /*
        Output will be Java because str is not updated and
        objects created "Java", "Java Rules !"
        but str not updated so only "Java" will be printed
        No reference to "Java Rules !" object in the heap memory
         */
        String str = "Java";
        str.concat(" Rules !");
        System.out.println("x is " +str);

        str.toUpperCase();
        System.out.println("x is " +str);

        str.replace('a', 'X');
        System.out.println("x is " +str);

        //new obj in heap will be created as a new ref.
        str = str.concat(" Rules !");
        System.out.println("x is " +str);

        str.toLowerCase(); //a new obj will be created as a new reference in simple letters
        System.out.println("x is " +str);

        str = str.toLowerCase();
        System.out.println("x is " +str);

        String name = "Sandeep";
        String namex = "          Kanmal    sandeep         ";
        String nameI = "SANDEEP";
        System.out.println("Name length " + name.length());
        System.out.println("Char at 3 : " + name.charAt(3));
        System.out.println("index of S " + name.indexOf("S"));
        System.out.println("Last index of a : " + name.lastIndexOf("a"));
        System.out.println("Are these strings are equal :  " + name.equals(nameI));
        System.out.println("ignore case equals " + name.equalsIgnoreCase(nameI));

        namex = namex.trim(); //remove white space from both sides of the string
        System.out.println("String after trimming : " + namex.length() + "  " +namex);

        System.out.println("K->L replacement of values : " + namex.replace("K", "L"));
        System.out.println("Substring >> "+ name.substring(2,7)); //count from the starting of the word to get the number
        System.out.println(namex.toUpperCase());
        System.out.println(nameI.toLowerCase());


    }
}
