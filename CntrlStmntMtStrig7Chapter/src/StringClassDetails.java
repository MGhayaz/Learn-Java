public class StringClassDetails {
    public static void main(String[] args) {
        String iteratedStringPool = "abc";
        String iteratedStringPool2 = "abc"; // iteratedStringPool aur iteratedStringPool2 donoh string pool inside heap memory ke common address ku refer kare , kyuki inku "" se banaye without new keyword with same input "abc"
        // agar iteratedStringPool == iteratedStringPool2 kare toh true aata kyuki inke address same hai

        // agar new keyword use karke banaye like:
        String newKeywordStringInHeap = new String("xyz"); // ye heap mai general object comapartment mai jaake create hora as an individual object jiska address alag rehta , jiski copy nai rehti , same input deke alag address and alg name  deke ek new string obj bi bana sakte
        // agar isku compare kare with iteratedStringPool toh newKeywordStringInHeap.equal(iteratedStringPool) karna padta to compare input jo actually alag alg hai (abc in iteratedStringPool and xyz in newKeywordStringInHeap)


        // for both type of object creation
        // isme string .length(),.intern(), compareTo(), .equal() etc methods rehte
    }
}
