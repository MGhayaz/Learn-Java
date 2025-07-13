import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Welcome to day identifier\nPlease enter your day number: ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        // OldSwitch(day);
        newSwitch(day);

    }

    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "holiday";
            default -> "Invalid";
        };
        System.out.println(dayStr);
    }

    public static void OldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6, 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
