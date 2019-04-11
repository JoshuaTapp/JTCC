/*
 * Created on 4/10/19 10:58 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

/*
 * Created on 4/10/19 10:54 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

package chapter21;

import java.util.Arrays;
import java.util.LinkedHashSet;


public class SetOperationsOnLinkedHashSets {

    public static void main(String[] args){

        //Create two Sets that contain String arrays
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        /*Set Interface Bulk Operations
            .addAll combines two sets
            .removeAll removes matching values
            .retail all removes but matching values
         */

        LinkedHashSet<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);

        LinkedHashSet<String> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);

        LinkedHashSet<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("The union of the two sets: " + union + "\n");
        System.out.println("The difference of the two sets: " + difference +"\n");
        System.out.println("The intersection of the two sets: " + intersection + "\n");
    }
}
