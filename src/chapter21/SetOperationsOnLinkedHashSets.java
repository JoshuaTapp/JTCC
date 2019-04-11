/*
 * Created on 4/11/19 6:05 PM by Joshua Tapp
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

        //Arrays.asList takes an array and returns it as a List. Because List/Sets are convertible, a list can construct a Set.
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        LinkedHashSet<String> union = new LinkedHashSet<>(set1);        // Due to data destruction, copy set1 to union.
        union.addAll(set2);                                             // Adds all elements to the union Set.

        LinkedHashSet<String> difference = new LinkedHashSet<>(set1);   // Due to data destruction, copy set1 to difference.
        difference.removeAll(set2);                                     // Because sets can not have duplicate elements, this method removes all matching elements from the two sets

        LinkedHashSet<String> intersection = new LinkedHashSet<>(set1); // Due to data destruction, copy set1 to intersection.
        intersection.retainAll(set2);                                   // Sets retains all duplicates and removes all distinct elements.

        System.out.println("The union of the two sets: " + union + "\n");
        System.out.println("The difference of the two sets: " + difference +"\n");
        System.out.println("The intersection of the two sets: " + intersection + "\n");
    }
}
