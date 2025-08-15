package UsingThread;

public class test {
    public static void main(String[] args) {
        System.out.println("first Message from main thread");
        FirstTask p1 = new FirstTask();
        SecondTask p2 = new SecondTask();
        ThirdTask p3 = new ThirdTask();
        p3.start();// diversifying the load among different thread never promises code-order sequence , these thread complete their task af their own time
        p1.start();
        p2.start();


        // even a new obj made by common class, behaves the same
        FirstTask p11 = new FirstTask();
        p11.start();

        System.out.println("Last message from main thread");
    }
}
