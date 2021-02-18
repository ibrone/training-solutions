package week11d01;

public class DivisorFinder {
    public int findDivisort(int n) {
        int result = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int digit =Integer.parseInt(String.valueOf(number.charAt(i))) ;
            if (n % digit == 0) {
                result++;
            }
        }
return result;
    }
}