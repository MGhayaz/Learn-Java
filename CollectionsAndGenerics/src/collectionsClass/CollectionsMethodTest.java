package collectionsClass;

import Queue.CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethodTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList <>();
        list.add(33);
        list.add(4423);
        list.add(0);
        list.add(-999);
        list.add(1000);
        list.add(65);
        list.add(44);
        list.add(-33);
        Collections.addAll(list, 77);  // 77 is added through the collection method
        CollectionUtility.print(list);  // our utility class [not inbuild]
        Collections.sort(list); // used to sort , also if set is passed, this methods will not work
        CollectionUtility.print(list);
        Collections.reverse(list);
        CollectionUtility.print(list); //used to reverse
        System.out.println(Collections.max(list)); // shows the max number of list
        System.out.println(Collections.min(list)); // shows the min number of list


        List<Integer> NoModification = Collections.unmodifiableList(list);   // transforming the list into a new immutable
        // list with colllection.unmodifiableList where new obj is immutable , it is for readonly version , just to see contain/size etc
        // but previous list is still mutable like
             //NoModification.add(12);
             //list.add(12);
             // System.out.println(list);



    }
}
