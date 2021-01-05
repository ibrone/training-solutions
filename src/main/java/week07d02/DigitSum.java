package week07d02;

public class DigitSum {

    public int sumOfDigitSum (int x){
        int sum =0;
        while (x!=0){
            sum += x%10;
        x=x/10;
    }
    return sum;
}}
