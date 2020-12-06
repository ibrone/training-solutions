public class Incrementer {

    public boolean isValidNumber(String number) {
        try {
            int value = Integer.parseInt(number);
            if (value < 0 && value > 10) {
                return true;
            }
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


}
