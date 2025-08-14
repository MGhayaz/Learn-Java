package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {
    public static void main(String[] args) {

        // map takes first generic for key and second generic for value, the above map is an example of string Integer map
        // a key can contain similar value, but each key in maps should be different from eachOther
        Map <String,Integer> mapNew = new HashMap<>();
        mapNew.put("Hello",0);
        mapNew.put("My",1);
        mapNew.put("Name",2);
        mapNew.put("is",3);
        mapNew.put("Ghayaz",1+3);
        for ( String neww : mapNew.keySet() ){
            System.out.printf("the key is %s, and value is %d\n", neww , mapNew.get(neww));
        } // map hamesha set format which is un-ordered mai return karta
        int total = mapNew.size();
        System.out.println(total);
        System.out.println(mapNew.values());
        if(mapNew.containsKey("my")){ // case sensitive
            System.out.println("present");
        }



    }
}
