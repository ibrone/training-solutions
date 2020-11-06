package statenents;

public class Time {

    private int hour;
    private int minutes;
    private int seconds;

    public int getInMinutes() {
        return minutes + hour * 60;
    }

    public int getSeconds() {
        return seconds + hour * 360 + minutes * 60;
    }

    public Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    ///public boolean earlierThan
}

