package in.Ghayaz;
 import GetterSetter.car;
public class setterAndGetterTest {
    public static void main(String[] args) {
        car lexus= new car("russian beige","lexus es",55,27700000);

        System.out.printf("%s, %s %n",lexus.getColor(),lexus.getModel());  // bagair obj ki class ke instance variable ku modify kare,
        // unku ek public method me dalke , safely pas karta , ye ek getter hai
        lexus.setColor("bella brown");  // setcolor ek public method hai, jo color update karta , ye setter hai
        System.out.println(lexus.getColor());
    }
}
