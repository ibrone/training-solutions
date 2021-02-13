package week10d01;

import java.util.List;

public class Hiking {

    public static double getPlusElevation(List<Double> elevationList){
        if (elevationList== null)
            throw new IllegalArgumentException("List is null");
       double result = 0;
       for (int i = 1;i< elevationList.size();i++){
           if (elevationList.get(i)>elevationList.get(i-1)){
               result += elevationList.get(i)-elevationList.get(i-1);
           }

       }
return result;

}
}

