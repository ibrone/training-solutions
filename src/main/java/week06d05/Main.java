package week06d05;

import java.math.BigInteger;

public class Main {

    public static void main (String[] args){
        BigInteger i = new BigInteger(""+Integer.MAX_VALUE);
        System.out.println(i.add(new BigInteger("1")));
    }
}
