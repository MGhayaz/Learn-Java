import java.util.Scanner;

public class shorthand {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int a = 100;
         int b = 200;
         int c = 300;
         int d = 400;

         int x1 = input.nextInt();
         a -= x1;
        System.out.println(a);

        int x2 = input.nextInt();
        b *= x2;
        System.out.println(b);

        int x3 = input.nextInt();
        c /= x3;
        System.out.println(c);

        int x4 = input.nextInt();
        d %= x4;
        System.out.println(d);


    }
}
