package In.SuperKeyword;
// full practice of super keyword in constructor, variable and methods
class car extends Vehicle {
    public String carNumber ;
    public String commonInBoth = "common from car class";

    public car(){
        super(" ");

        this.carNumber = "car class with default constructor";


    }

   public car(String  carNumber){
       super("constructor test");
       this.carNumber = carNumber;
   }


    public String commonInTest(){
         // using superclass method here a
        return super.commonInTest() + "\n common method from car class";
    }

   public void dummy(){
       String veh = super.commonInBoth;
       String carru = this.commonInBoth;
       System.out.println(veh);
       System.out.println(carru);
       System.out.println( this.commonInTest() );
       System.out.println( super.commonInTest() );
       System.out.println();
   }


}
