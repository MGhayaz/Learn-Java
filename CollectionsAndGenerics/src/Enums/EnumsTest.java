package Enums;

public class EnumsTest {
    public static void main(String[] args) {
        // average usuage
        WeekDays weekly = WeekDays.SUNDAY;  // enums are meant for options only thing , here only names of days in week are present
        System.out.println(weekly);


        //pro usuage
     TrafficLights trf = TrafficLights.RED;
        System.out.println(trf); // prints its defined constant
        TrafficLights gogreen = TrafficLights.GREEN;
        System.out.println(gogreen.getActionAsPerColor());  // get action for color through getter
        System.out.println(gogreen);




    }
}

