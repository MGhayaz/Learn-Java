package UsingThread;

public class UsingRunnable implements Runnable{

    private final char InputChar;
    public UsingRunnable(char InputChar) {
        this.InputChar = InputChar;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 300; i++) {
            System.out.printf("%d%c ", i, InputChar);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(InputChar + "Completed task with " + (endtime - startTime) + "ms" );
    }

}
