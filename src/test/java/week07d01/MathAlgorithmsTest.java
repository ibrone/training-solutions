package week07d01;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathAlgorithmsTest {


    @Test
    public void isPrimeTest (){
        assertFalse(MathAlgorithms.isPrime(1));
        assertFalse(MathAlgorithms.isPrime(4));
    assertFalse(MathAlgorithms.isPrime(2));
        assertFalse(MathAlgorithms.isPrime(23));
        assertTrue(MathAlgorithms.isPrimeOtherWay(19));




    }

}
