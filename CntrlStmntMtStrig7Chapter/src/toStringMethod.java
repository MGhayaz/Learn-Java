public class toStringMethod {
    int noOfWheels, noOfDoors;


    public toStringMethod(int noOfWheels, int noOfDoors) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("toStringMethod{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        toStringMethod car = new toStringMethod(4, 6 );

        System.out.println(car.toString());
    }

}
