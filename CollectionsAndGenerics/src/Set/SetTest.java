package Set;

import Queue.CollectionUtility;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("Mohammed ");
        set.add("Ghayaz ");
        set.add("Ghouse ");
        CollectionUtility.print(set);
        if(set.contains("Ghouse"+ " ")){
            System.out.println("Yes it's there");
        }
        set.remove("Mohammed ");
        CollectionUtility.print(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());



    }
}
