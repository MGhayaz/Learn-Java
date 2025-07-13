public class randomNumbersMathClass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-77)); // negative ku positive
        System.out.println(Math.ceil(5.1010)); // 6 kardeta, nearest upperside integer long bnata
        System.out.println(Math.floor(5.1010)); // 5 kardeta, narest downside integer long bnadeta
        System.out.println(Math.round(5.1010)); // 5 kardeta nearest integer uthata
        System.out.println(Math.max(4,5)); // 5,  sirf do num utake bada wala deta
        System.out.println(Math.min(4,5)); // sirf do num utake chota wala deta
        System.out.println(Math.pow(2,2)); // pehele input ku dusre num ka power (2power2 = 4 )
        System.out.println(Math.sqrt(25)); // ek num leke uska squareRoot nikalke deta
        System.out.println(Math.random()); // no argument needed but returns a random double number between 0.0 to 1.0 in stock
        System.out.println( (int) (Math.random()*1000) + 1  ); // range bade 1000 tak by x1000 but nth number ku consider nai karta (range 999 rehti thi )isliye alag se +1 kare to make 1000 saathi mai int conversion bi kare
        System.out.println(Math.round(Math.random()  * 1000 ) ); // random ka clean format jahan +1 lagane ki jarurat nihai round() 999.xx ku 1000 bana sakti aur explicit conversion bi nai toh nai
        System.out.println(Math.PI); //pi ek constant value hai jo math inbuild class mai saved hai, aise aur hai jaise E for Pi and base of saare natural logaritums
    }

}
