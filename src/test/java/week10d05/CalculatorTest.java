package week10d05;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalculator(){
        assertEquals(16, new Calculator().findMinSum(new int[]{1,3,5,7,9}));
        assertEquals(16, new Calculator().findMinSum(new int[]{1,9,5,7,3}));
        assertEquals(11, new Calculator().findMinSum(new int[]{1,9,5,7,3,2}));
    }

    @Test
    void testCalculatorToSmalList(){
        Exception ex1 = assertThrows(IllegalArgumentException.class, ()-> new Calculator().findMinSum(new int []{1,9,7}));
        assertEquals("Túl kicsi a lista",ex1.getMessage());

    assertThrows(IllegalArgumentException.class, ()-> new Calculator().findMinSum(new int[]{}));
    }

}