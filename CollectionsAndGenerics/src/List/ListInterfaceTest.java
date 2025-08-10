package List;


import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {

       List <String> StringList = new ArrayList<>();
       // <> are diamond brackets, used for predefining the obj input type
        // which is string her it is only for readabilty enhancment
       StringList.add("i am ");
       StringList.add(1, "Megatron");
       StringList.add(2, "the lord of cybertron");
       StringList.remove(2);
       StringList.remove("Megatron");
       StringList.set(0,"I Am ");
       StringList.add("Optimus Prime, And i send this message to any surviving autoBots taking refuge among the stars");

        System.out.println(StringList); // print entire list
        if(StringList.contains("Megatron")){
            System.out.println("Bloody Deception!!");
        } else{
            System.out.println("I carry great descendant of CyberTron");
        }
        System.out.println(StringList.indexOf(12)); // returns -1 when element in given index does not exist
        for (int j = 0; j < StringList.size() ; j++){
            System.out.print(StringList.get(j));
        }



    }
}
