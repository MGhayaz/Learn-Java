package Queue;

import java.util.Collection;

public class CollectionUtility {
    public static <E> void print(Collection <E> coll){
        System.out.print("Collection is : ");   // <E> is generics , meant for segment creation, learn in future
        for(E obj : coll){
            System.out.print(obj);
        }
        System.out.println();

    }
}
