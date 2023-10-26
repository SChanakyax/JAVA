package week10;


/**
 * remove duplicate characters
 */
public class rmDuplicate {
    public static void main(String[] args) {

        String str = "Mississippi";
        String rev = "";

        for(int i=0; i<str.length(); i++ ){
            String s = String.valueOf(str.charAt(i));

            if (!rev.contains(s)) {
                rev = rev.concat(s);
            }

        }

        System.out.println(rev);
    }
}
