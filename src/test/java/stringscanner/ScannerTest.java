package stringscanner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScannerTest {

    @Test
    public void testScanner (){
        Scanner s = new Scanner("aaa bbb ccc ddd");
        List<String> l = new ArrayList<>();
        while (s.hasNext()){
            l.add(s.next());
            System.out.println(l);
        }

        assertThat(l,equalTo(Arrays.asList("aaa", "bbb", "ccc", "ddd")));
    }
}
