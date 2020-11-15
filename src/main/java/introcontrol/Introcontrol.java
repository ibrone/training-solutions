package introcontrol;

public class Introcontrol {




    public int substractTenifGreaterThanTen (int number){
        if (number > 10) {
            return number - 10;
        }   else {return  number;
        }

    }
    public String describeNumber( int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }
        public String greetingToJoe(String name) {
            if (name.equals("Joe")) {
                return "Hello Joe";
            }
            else{
              return  "";
            }

        }

        public int calculateBonus (int sale){
        if (sale >= 1000000){
                return sale / 10;
            }
        else{
            return sale = 0;
            }
        }

        public void printnumbersBetween (int min, int max) {
            for (int i = min; i <= max; i++) {
                System.out.println(i);
        }}
}

