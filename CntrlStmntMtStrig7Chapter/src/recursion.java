import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        System.out.print("Welcome to factorial maker\nPlease enter your number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        long fact = factorialMaker(number, 1);

        System.out.println("the number is " + fact);
    }
    public static long factorialMaker(int num , int runner){
        if (runner == 0) return -1 ;
        if(runner > num){
            return 1;
        }
       return runner * factorialMaker(num , runner +1);
//        System.out.println("Function called no : "+ num);
//        if(num == 1){
//            return 1;
//        }
//        return num * factorialMaker(num - 1);
    }
}
