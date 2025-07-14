package In.Ghayaz;

public class Car extends Vehicle {
 private int noOfDoors;
    public Car(){
        super (4);
    }


    @Override
    void StartSound() {
        System.out.println("Vroommmmm");
    }

    public void speed(){
        System.out.println("speed from interface class type (interfaceTest) ");
    }
}
