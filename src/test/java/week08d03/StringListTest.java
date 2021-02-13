package week08d03;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListTest {

    @Test
    public void shortestWordTest(){
        StringList stringLists = new StringList();
        List<String> input = Arrays.asList("aaa","bbb","ccc","ddd");
        List<String> expectedOutput = Arrays.asList("aaa","bbb","ccc");


    }

    @Test
    public void unionTest(){
        List<String> first = new ArrayList<>(Arrays.asList("aaa","bbb","ccc","ddd"));
        List<String> second = new ArrayList<>(Arrays.asList("aaa","bbb","ccc"));
        StringList sl = new StringList();
    assertEquals(Arrays.asList("a","b","c"), sl.stringListUnion(first,second));
        System.out.println(first);

    }
}
