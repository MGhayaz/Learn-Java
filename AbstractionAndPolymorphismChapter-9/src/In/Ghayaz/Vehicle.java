package In.Ghayaz;

public abstract class Vehicle implements InterfaceTest{
    // Abstract classes are meant only for inheritance purpose not for object creation etc
    private int noOfWheels;

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    public void commute(){
        System.out.println("Going");
    }

    // an abstract method sirf abstract class mai ich bana sakte, aur isku koi body nai rehti
    // ye
    abstract void StartSound();


}
