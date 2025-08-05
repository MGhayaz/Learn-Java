package In.Exception;

import java.util.Scanner;

public class ExceptionTestWithDivison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        int a = input.nextInt();
        int b = input.nextInt();


        divide(a,b);
    }

    public static void divide(int a , int b) {
       //  int [] arr = new int[5];
        try{
            int num = a/b;
           //arr[6] = a/b;
            System.out.println(num);
//        } catch(ArithmeticException www){
//            System.out.println("arithmetic exception with "+ www.getMessage());
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException arrayFix ){
            System.out.println("Array issue with " + arrayFix.getMessage());
        } catch (Throwable th){
            System.out.println("the GoAt to resolve all");
        }


    }

}
