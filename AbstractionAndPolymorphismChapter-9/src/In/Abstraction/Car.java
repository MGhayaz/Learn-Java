package In.Abstraction;

 class Car extends Vehicle {
 private int noOfDoors;
     Car(){
        super (4);
    }


    @Override
    void StartSound() {
        System.out.println("Vroommmmm");}

     public void speed(){
        System.out.println("speed from interface class type (interfaceTest) ");
    }
}
