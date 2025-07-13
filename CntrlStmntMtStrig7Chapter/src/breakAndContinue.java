public class breakAndContinue {
    public static void main(String[] args) {

        //break test
        for (int i = 0; i <= 50; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i);
        }
        System.out.println( );
        //continue test
        for (int j = 0; j <= 20; j++) {
            if (j == 6) {
                System.out.println("=6 hua");
                continue;
            }
            System.out.println(j);

        }
        System.out.println("ok report");


    }
}
