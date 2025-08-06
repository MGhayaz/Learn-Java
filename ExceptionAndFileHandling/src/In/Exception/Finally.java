package In.Exception;

public class Finally {
    public static void main(String[] args) {
        System.out.println(finallyTest());

    }
    public static int finallyTest(){
        int a;
        try {
            a  = 5/0;
        } catch (ArithmeticException ArE) {
            System.out.println(ArE.getMessage());
            //throw ArE;

            return 0;
            // catch condition meet ho ya na ho, try and catch block completion ke baad finally compulsory read hota, even throw karo ya return
        } finally {
            System.out.println("finally : I am immune");
        }

        return a;

    }
}
