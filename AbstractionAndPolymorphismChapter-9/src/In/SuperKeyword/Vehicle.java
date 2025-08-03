package In.SuperKeyword;
// full practice of super keyword in constructor, variable and methods
public abstract class Vehicle {
 public String  vehicleNumber = "Vehicle class";
    public String commonInBoth = "common from vehicle class";
    public Vehicle (String vehicleNumber ){
        this.vehicleNumber = vehicleNumber;

    }




    public String commonInTest(){
        return "common method from vehicle class";
    }

}
