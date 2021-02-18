package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide (Ride rideToBeAdded){
        if (rides.size()==0){
            rides.add(rideToBeAdded);
            return;
        }
        if (rideToBeAdded.getWeekDay()<rides.get(rides.size()-1).getWeekDay()){
            throw new IllegalArgumentException("Ride to be added was earlier then last ride");
        }

        if (rideToBeAdded.getIndexOfRide()<=rides.get(rides.size()-1).getIndexOfRide()){
            throw new IllegalArgumentException("Ride to be added was earlier then last ride");
        }
        rides.add(rideToBeAdded);
    }

public int getDayOfNoWork(){
        int [] weekdays = new int[7];
        for (Ride ride : rides){
            weekdays[ride.getWeekDay() - 1] +=1;
        }
        for (int i = 0;i<weekdays.length;i++){
            if (weekdays[i]==0){
                return i +1;
            }
        }
        return -1;

}
}
