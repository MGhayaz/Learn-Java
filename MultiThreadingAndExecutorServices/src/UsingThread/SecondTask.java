package UsingThread;

public class SecondTask extends Thread {
    public void run(){
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 300; i++) {
            System.out.print(i+ "$ ");
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Completed second task with "+ (endtime - startTime) + "ms" );
    }
}
