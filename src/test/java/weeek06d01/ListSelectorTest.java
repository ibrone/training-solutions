package weeek06d01;

import org.junit.Test;
import week06d01.ListSelector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    ListSelector ls = new ListSelector();

@Test
    public void getEvenIndexElementsTest(){
    assertEquals ("almabarack",ls.getEvenIndexElements(Arrays.asList("alma","körte","barack")));
}

@Test
    public void getEvenIndexElementsWithNull(){
    assertThrows (IllegalArgumentException.class, ()->ls.getEvenIndexElements(null));

}

@Test
    public void getEvenIndexElementsWithEmptyList(){
    assertEquals("", ls.getEvenIndexElements(new ArrayList<>()));
}


}
