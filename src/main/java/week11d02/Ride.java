package week11d02;

public class Ride {

    private int weekDay;
    private int indexOfRide;
    private int rideInKm;

    public Ride(int weekDay, int indexOfRide, int rideInKm) {
        this.weekDay = weekDay;
        this.indexOfRide = indexOfRide;
        this.rideInKm = rideInKm;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public int getIndexOfRide() {
        return indexOfRide;
    }

    public int getRideInKm() {
        return rideInKm;
    }
}
