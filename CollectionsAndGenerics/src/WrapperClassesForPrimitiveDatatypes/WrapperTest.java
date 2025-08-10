package WrapperClassesForPrimitiveDatatypes;

public class WrapperTest {
    public static void main(String[] args) {
        //Integer Wrapper1 = new Integer(44);  discontinued
        //Integer Wrapper1 = Integer.valueOf(124);
        //Integer Wrapper1 = Integer.valueOf("12444"); // we can also pass string which will further converted to integer as per required


        //AutoBoxing(Conversion of primitive to obj )
         //        int noWrapper = 13436
        //         Integer Wrapper1 = noWrapper;


        Integer Wrapper1 = 444;
        Integer Wrapper2 = 444;
        if(Wrapper1.compareTo(Wrapper2) != 0){
            System.out.println("Not Equal");
        } else{
            System.out.println("Equal");
        }

        System.out.println(Wrapper1.compareTo(Wrapper2)); // if equals returns 0 iif not returns -1
        System.out.println(Wrapper1.describeConstable());


    }
}
