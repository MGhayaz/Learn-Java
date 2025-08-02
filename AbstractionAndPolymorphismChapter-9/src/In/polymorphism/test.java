package In.polymorphism;

public class test {
    public static void main(String[] args) {

        car car = new car();
        plane aeroplane =new plane();
        Fortuner fortuner = new Fortuner();
        cycle bicycle = new cycle();


  // yahan car ke liye aur fortuner ke liye output "class is moving" same aata kyuki car ke fortuner bana, but plane vehicle
        // se bana aur khud ke class mai InterfaceClassMethodSound() method override bi kara like cycle
        cast(car);
                    cast(fortuner);


        cast(aeroplane);

        cast(bicycle);
    }
    public static void cast(Vehicle  veh){
        veh.InterfaceClassMethodSound();
        //car cveh = (car ) veh; agar ye banaye, toh input veh mai sirf car ya uske bache ich dalo, plane ya bycle jo cast method me ke new obj "cveh" mai niya sakte, woh mat karo


    }
    Vehicle fortunerVehicle = new Fortuner(); // ye hosakta kyuki parent mai child ya grandchildren dal sakte,
    // Fortuner fortunerCar = new car(); "error"
    //but child or grandchildren mai parent dal sakte
}
