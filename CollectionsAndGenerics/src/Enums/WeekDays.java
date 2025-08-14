package Enums;

public enum WeekDays {

    // normal level of enums , pro is in another enums class in same package
    SUNDAY, MONDAY, TUESDAY,WEDNESDAY,THURSDAY, FRIDAY,SATURDAY;

    @Override
    public String toString() {
        return "Today is " + name();
    }
}
