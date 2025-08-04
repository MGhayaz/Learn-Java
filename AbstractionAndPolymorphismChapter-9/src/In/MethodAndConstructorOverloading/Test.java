package In.MethodAndConstructorOverloading;

 class Test {
    // instance variables for testing constructors
    int age;
    int id;
    String name;


    public static void main(String[] args) {

    }
    public int add(int a , int b ){
        return a+b;
    }
    public int add(int a ){
        return a;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
    public String add(String a , String b ){
        return a+b;
    }
    // ye saare chalte kyu ki sabke signature like arguments different hai
    // agar name same nihai aur parameters samw hai toh bi chlta like

     int DifferentAdd(int a , int b ){
        return a+b;
    }

    // SAME GOES WITH CONSTRUCTORS


     Test(int age, int id){
        System.out.println("constructor with two arguments");
        this.age = age;
        this.id = id;
    }
     Test(){
        System.out.println("constructor with no arguments");
    }
     Test(int age, int id, String name){
        System.out.println("constructor with three arguments");
        this.age = age;
        this.id = id;
        this.name = name;
    }




}
















