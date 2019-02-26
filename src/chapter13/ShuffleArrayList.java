package chapter13;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

    public static void main(String args[]) {

        ArrayList<Number> list = new ArrayList<Number>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));

        ShuffleArrayList.shuffle(list);
        ShuffleArrayList.println(list);
    }

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }

    public static void println(ArrayList<Number> list) {
        for (Number element : list) {
            System.out.print(element.intValue() + " ");
        }
        System.out.println();
    }
}