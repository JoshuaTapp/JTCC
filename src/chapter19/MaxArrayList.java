package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxArrayList {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
            list.add(8);
            list.add(9);
            list.add(4);
            list.add(5);

        System.out.println("Max: " +MaxArrayList.<Integer>max(list));
    }

    public static <E extends Comparable<? super E>> Object max(List<E> list) {
        return Collections.max(list);
    }
}
