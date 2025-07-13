import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nam kya hai bade bhai : ");
        String name = input.nextLine();
        System.out.println("ander aao "+name+" bhai");
        System.out.print("acha, "+name+" bhai kya umar hai apki :");

        int age = input.nextInt();
        System.out.println(age+" Saal ke hai aap, mashaalah.");


    }
}
