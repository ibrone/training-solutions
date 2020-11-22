package primitivetypes;

public class PrimitiveTypes {

public static final int NUMBER_OF_BITS = 32;
    public String toBynariString (int n){
        String s = " ";
        for (int number = Math.abs(n); number > 0;) {
    int bit = number % 2;
s = bit + ""+s;
number = number /2;
    }
}
}
