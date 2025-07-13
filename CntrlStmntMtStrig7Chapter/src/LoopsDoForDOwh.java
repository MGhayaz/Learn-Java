import java.util.Scanner;

public class LoopsDoForDOwh {
    public static void main(String[] args) {
        String[] array = new String[]{
        "mujju","karthik","animesh","ayush","bhanu","sarfaraz","salman","A2B","tarun",
        };
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        for (String variable : array){ // array traversal in "for each" loop with ":"
            System.out.println(variable);

        }

//        for (int i = 0 ; i <= 100; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int j = 100 ; j >= 0 ; j--){
//            System.out.print(j + " ");
//        }
//        int userInput;
//        do {
//            Scanner input =new Scanner(System.in);
//            System.out.println("please enter your age");
//            userInput = input.nextInt();
//        } while(userInput > 100 || userInput < 0);
//        System.out.println(userInput);


    }


}
