import java.util.Scanner;

class swap7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swap settings\n\n");
        System.out.print("enter value of A: ");
        int a = input.nextInt();
        System.out.print("enter value of B: ");
        int b = input.nextInt();
        int c = a;
        a= b;
        b= c;
        System.out.println("Swapping is done");
        System.out.println("value of A: "+a);
        System.out.println("value of B: "+b);
    }
}
