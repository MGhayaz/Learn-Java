import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to rail discount calculator");

        System.out.print("Are you a female? (True/false) : ");
        boolean IsFemale = input.nextBoolean();

        System.out.print("please enter your age: ");
        int age = input.nextInt();

        if (age < 5){
            System.out.println("Your discount percentage will be 75%");
        } else if (IsFemale){
            System.out.println("Your discount percentage will be 50%");
        }
        else if (age > 60 && !IsFemale) {
            System.out.println("Your discount percentage will be 25%");
        }

    }
}
