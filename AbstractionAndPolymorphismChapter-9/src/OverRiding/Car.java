package OverRiding;

 public class Car extends Vehicle {
     int speed;
     //In Java, constructor overriding is actually not possible. Why?
     //
     //Because:
     //
     //Constructors are not inherited.
     //But you can achieve similar behavior using constructor chaining via super() in subclass constructor.
     public  Car(int noOfDoors, int speed){
         super(noOfDoors);
         this.speed = speed;
         // constructor chaining


     }
     //access modifier public is set from protected which was defined in his parent cls vehicle
     @Override
      public void ToVehicle() {

         System.out.println("Car is revving");
     }
 }
