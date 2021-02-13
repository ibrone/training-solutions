package week08d03;

import java.util.*;

public class StringList {


    public List<String> stringListUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<String>(first);
        for (String s : second) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }


}
