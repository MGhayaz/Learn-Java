package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTestLinkedList {
    public static void main(String[] args) {

        // tail se add hota aur head ke bahar nikalta
        Queue <Integer> queue = new LinkedList<>();

        //adds
        queue.add(1); // eexception phekta if add nahi kar paya
        queue.offer(2); // just a proposal to add
        CollectionUtility.print(queue);

        System.out.println(queue.poll()); // remove if there is an element to remove
        System.out.println(queue.peek()); // just look if there is any element
        System.out.println(queue.element()); // return exception if element is not available there
        System.out.println(queue.remove()); // exception if there is no element to remove
        CollectionUtility.print(queue);






    }
}
