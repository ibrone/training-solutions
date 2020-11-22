package arrays;


import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysofWeek(){
        return Arrays.asList("Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap");
    }


    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues (double[] day, double [] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

        public  boolean wonLottery (int[] egyik, int[] masik){
        int [] copyofegyik = Arrays.copyOf(egyik, egyik.length);
        int [] copyofmasik = Arrays.copyOf(masik, masik.length);
        Arrays.sort(copyofegyik);
        Arrays.sort (copyofmasik);
        return Arrays.equals(copyofegyik,copyofmasik);
        }
}