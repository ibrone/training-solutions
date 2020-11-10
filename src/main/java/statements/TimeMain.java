package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg pontos időpontot (óra):");
        int hour = scanner.nextInt();
        System.out.println("Kérem adja meg pontos időpontot (perc):");
        int minutes = scanner.nextInt();
        System.out.println("Kérem adja meg pontos időpontot (másodperc):");
        int seconds = scanner.nextInt();

        Time time1 = new Time(hour,minutes,seconds);

        System.out.println("Kérem adja meg a másik időpontot (óra):");
        int hour2 = scanner.nextInt();
        System.out.println("Kérem adja meg a másik időpontot (perc):");
        int minutes2 = scanner.nextInt();
        System.out.println("Kérem adja meg a másik időpontot (másodperc):");
        int seconds2 = scanner.nextInt();

        Time time2 = new Time(hour2,minutes2,seconds2);

        System.out.println ("Az 1. megadott pontos idő: " + hour + ":" + minutes + ":" + seconds +"Percben megadva: ");
        System.out.println("A 2. megadott pontos idő: " + hour2 + ":" + minutes2 + ":" + seconds2);





    }


}
