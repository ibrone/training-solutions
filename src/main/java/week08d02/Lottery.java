package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public static final int NUMBER_OF_NUMBERS = 5;
    public static final int NUMBERS_INTERVAL = 90;

    public List<Integer> getNumbers(int interval, int numbers){
        List<Integer> result = new ArrayList<>(numbers);
        for (int i=0;i<numbers;i++){
            result.add(generateNumberNotInList(result,interval));
        } return result;
    }

    private Integer generateNumberNotInList(List<Integer> myList, int interval){
        Random random = new Random(5);
        int number = random.nextInt(interval)+1;
        while (myList.contains(number)){
            number = random.nextInt(interval)+1;
        }
        return number;
    }

public static void main (String[]args){
        Lottery lottery = new Lottery();
    System.out.println(lottery.getNumbers(90,5));

}

}


