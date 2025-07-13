package inside.AccessModifierTest;

import inside.AccessModifiers.Car; // Car class public thi,
// dusre package mai aasakti, magar import karna padta

class Default {
    public static void main(String[] args) {
        Car newCar = new Car("blue",1890000,
                "Honda City",170000,55);
        String model = newCar.model;
       // int purchase = newCar.purchaseprice; newCar.purchasePrice niyata kyuki unne private hai,
        // sirf jahan define hua wahan ke class ke ander ich chalta
         System.out.println(newCar);
    }


}
