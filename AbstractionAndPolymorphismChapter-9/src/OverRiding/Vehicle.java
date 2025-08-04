package OverRiding;

   class Vehicle {
       int noOfDoors;
       // constructor overriding test
       public Vehicle(int noOfDoors) {
           this.noOfDoors = noOfDoors;
       }
       //method overriding test

      protected void ToVehicle(){
          System.out.println("Vehicle is moving");
      }

   }
