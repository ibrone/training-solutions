package week05d03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void startWithATest (){
        ListCounter listCounter = new ListCounter();
    List <String> testList = Arrays.asList("Alma","körte","ananász","kenyér");

    assertEquals(2,listCounter.startsWithACounter(testList));

    }
@Test
    public void startWithAEmptyListTest(){
        ListCounter listCounter = new ListCounter();
        List <String> testlist = new ArrayList<>();
        assertEquals(0,listCounter.startsWithACounter(testlist));
}


@Test
public void startWithANonAListTest(){
    ListCounter listCounter = new ListCounter();
    List <String> testlist = Arrays.asList("körte","enenász","kenyér");
    assertEquals(0,listCounter.startsWithACounter(testlist));
}}

