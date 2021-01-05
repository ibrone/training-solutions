package week07d02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {
     @Test
    public void sumofDigitsTest(){
         DigitSum ds = new DigitSum();
     assertEquals(6,ds.sumOfDigitSum(312));
     }
}
