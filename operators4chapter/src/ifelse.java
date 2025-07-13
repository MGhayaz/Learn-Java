import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean seniorperson = false;
        boolean adultperson = true;
        if (seniorperson) {
            System.out.println("Welcome uncle");
        } else if (adultperson) {
            System.out.println("Welcome sir");
        } else {
            System.out.println("Welcome child");
        }

    }
}
