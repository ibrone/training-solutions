package controlselection.greetings;

public class Greetings {

    public void sayGreeting(int hour, int minute) {
        String greeting = "";

        if (hour < 5) {
            greeting = "Good Night";
        } else if (hour < 9) {
            greeting = "Good Morning";
        } else if (hour <= 18 && minute <= 30) {
            greeting = "Good Afternoon";
        } else if (hour < 20) {
            greeting = "Good Evening!";
        } else greeting = "Good Night";
    }
}

        ///int inMinutes = hour * MINUTES + minutes;
        ///if (inMinutes <= 5  * MINUTES || inMinutes > 20 * MINUTES) {
          //  return "Jó éjt";
        ///}
        ///else if (inMinutes > 5 * MINUTES && inMinutes <= 9 * MINUTES) {
          ///  return "Jó reggelt";
        ///}
        ///else if (inMinutes > 9 * MINUTES && inMinutes <= 18 * MINUTES + 30) {
          ///  return "Jó napot";
        ///}
        ///else {
          ///  return "Jó estét";
        ///}

