package In.Abstraction;

abstract class Vehicle implements InterfaceTest{
    // Abstract classes are meant only for inheritance purpose not for object creation etc
    private int noOfWheels;

     Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

     int getNoOfWheels() {
        return noOfWheels;
    }

    void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
     void commute(){
        System.out.println("Going");
    }

    // an abstract method sirf abstract class mai ich bana sakte, aur isku koi body nai rehti
    // ye
    abstract void StartSound();


}
