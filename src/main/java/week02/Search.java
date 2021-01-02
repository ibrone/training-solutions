package week02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String str, char c){
    List<Integer> result = new ArrayList<>();
    int currIdx = 0;
    while (currIdx < str.length()){
        int idx = str.indexOf (c, currIdx);
        if (idx<0){
            return result;
        } else {
            result.add(idx);
            currIdx = idx+1;

    }}
        return result;
}

}
