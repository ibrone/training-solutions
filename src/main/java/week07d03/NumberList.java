package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing (List<Integer> testList){
        for (int i=1;i<testList.size()-1;i++){
            if (testList.get(i-1)>testList.get(i)){
                return false;
            }
        }
        return true;
    }
}
