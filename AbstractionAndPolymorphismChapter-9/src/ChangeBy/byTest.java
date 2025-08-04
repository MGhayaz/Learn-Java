package ChangeBy;

public class byTest {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 10;
        System.out.println(add(a,b));
    }

    // copy of variable is passed in the argument x is copy of a and y is copy of b

    public static int add(int x, int y){
        return x+y;
    }
}
