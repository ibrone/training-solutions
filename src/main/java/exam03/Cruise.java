package exam03;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    public List<String> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger){



    }

    public void overBooking(){


    }

    public void getPassengerNamesOrdered(){

        Collections.sort(Passenger.getName(), Collator.getInstance(new Locale("hu", "HU")));

    }


    public double sumAllBookingsCharged(){
        int sum = 0;
        for (int i = 0; i<passengers.size();i++) {
            sum += basicPrice * CruiseClass.getValue();
        }
        return sum;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }


}
