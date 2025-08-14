package Enums;

public enum TrafficLights {

    RED("STOP"), YELLOW("PEEK AND GO"), GREEN("GO");
    final String actionAsPerColor;

    public String getActionAsPerColor() {
        return actionAsPerColor;
    }

    TrafficLights(String actionAsPerColor) {
        this.actionAsPerColor = actionAsPerColor;
    }
}
