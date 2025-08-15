package testForCPUSpeed;

public class testWithLoop {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " # ");
        }
        System.out.println("\ntask complete");
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " & ");
        }
        System.out.println("\ntask complete");
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " $ ");
        }
        System.out.println("\ntask complete");
        long end = System.currentTimeMillis();
        System.out.println("time taken: "+ (end - start));
    }
}
