package inside.AccessModifiers;

public class Car {
    public String colour ;
    public int costOfCar;
    public String model ;
    private int purchasePrice;
    private long fuelInLitres;

    public Car(String colour, int costOfCar, String model, // chahe datatype public ho ya private,
               // ye class ke constructor mai aata aur pass hota kyuki constructor ke parameter mai
               // same name ka ek alag variable define hota -> line no 10
               int purchasePrice, long fuelInLitres) {
        this.colour = colour;
        this.costOfCar = costOfCar;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.fuelInLitres = fuelInLitres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("colour='").append(colour).append('\'');
        sb.append(", costOfCar=").append(costOfCar);
        sb.append(", model='").append(model).append('\'');
        sb.append(", purchasePrice='").append(purchasePrice).append('\'');
        sb.append(", fuelInLitres=").append(fuelInLitres);
        sb.append('}');
        return sb.toString();
    }
}
