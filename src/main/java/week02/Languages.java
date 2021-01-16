package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> karakterek = new ArrayList<>();
        karakterek.add("Java");
        karakterek.add("Python");
        karakterek.add("JavaScript");

        System.out.println(karakterek);
        for (String i : karakterek){
            if (i.length()>5 ){
                System.out.println(i);
            }
        }
    }
}
