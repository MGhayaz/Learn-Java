package UsingThread;

public class ThirdTask extends Thread {
    public void run(){
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 300; i++) {
            System.out.print(i+ "# ");
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Completed third task with "+ (endtime - startTime) + "ms" );
    }
}
