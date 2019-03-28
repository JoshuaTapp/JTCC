package chapter19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SelectionSortArrayList {

    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(8);
            list.add(9);
            list.add(4);
            list.add(5);

        SelectionSortArrayList.<Integer>selectionSort(list);

        System.out.println(list);
    }

    public static <E extends Comparable<? super E>> void selectionSort(List<E> list)    {
        Collections.sort(list);
    }
}