package week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arr_List {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        int i = 13;
        num.add(10);
        num.add(i);
        num.add(44);
        num.add(23);

        for (int x : num) {
            System.out.println(x);
        }

        Collections.sort(num);
        System.out.println("\nUse collections.sort >> ");

        for (int x : num) {
            System.out.println(x);
        }


        System.out.println("\nUsing Iterator >> ");
        Iterator itr = num.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
