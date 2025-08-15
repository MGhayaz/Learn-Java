package UsingThread;

public class testForRunnables {
    public static void main(String[] args) {
        // runnable interface allow one to save the inheritance slot in class which can be only one for each class,
        // this interface allow us to create obj, later we are supposed to make thread obj and
        // pass the interface obj into thread obj's constructor as shown below

        UsingRunnable p1 = new UsingRunnable('@');
        //p1.start; this won't work because runnable interface has only one "run" method
        Thread t1 = new Thread(p1);
        // after thread creation, we can use .start()
        t1.start();
    }
}
