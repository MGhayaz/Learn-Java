package GetterSetter;

public class car {
    private String color;
    private String model;
    private int fuelInLitres;
    private int costOfCar; // saare variables private rakho, jo jarurat hai user ku present karna,
    // unku ek public method (17 line) mai dalke bagair class variables ki value modify kare pass kar sakte

    public car(String color, String model, int fuelInLitres, int costOfCar) {
        this.color = color;
        this.model = model;
        this.fuelInLitres = fuelInLitres;
        this.costOfCar = costOfCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("black")) {
            System.out.println("no");
        } else {
            this.color = color;
        }
    }

    public String getModel() {
        return model;
    }
}
