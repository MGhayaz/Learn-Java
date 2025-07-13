import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
//        if ( number1 > number2){
//            System.out.println(number1);
//        } else {
//            System.out.println(number2);
//        }
        int greatestNum ;
        greatestNum = number1 > number2 ? number1 : number2;
        System.out.println(greatestNum);

    }

}
