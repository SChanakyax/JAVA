package week3;

/**
 * Variables are created when their scope is entered
 * and destroyed when their scope is left
 */
public class ScopeDemo {

    public static void main(String[] args) {
        int x;
        x = 10;

        if(x==10){ //start new scope
            int y = 20; //known only to this block
            System.out.println("x and y : " + x + " " + y );
            x = y *2;
        }

     //   y=100; //y not known here its an Error!
        System.out.println("x is " + x);
    }
}
