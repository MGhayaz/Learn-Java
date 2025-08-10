package VariableArgs;

public class VarArgs {
    public static void main(String...args) {


        System.out.println("The sum of given numbers is: "+Add(100,12 , 15,100));


    }
    public static int Add(int first , int second , int...Add){
        int result = first + second ;
        for (int adder : Add) {
            result += adder;
        }
        return result;

    }
}
