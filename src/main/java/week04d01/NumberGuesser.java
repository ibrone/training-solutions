package week04d01;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

private static int cel;
    private static int tipp;
    private final Random rnd = new Random();
    public static void main(String[] args) {
     Random rnd  = new Random();
     cel = rnd.nextInt(100)+1;

        Scanner scanner = new Scanner (System.in);

        System.out.println(cel);
        System.out.println("Kérem a tipped:");
        tipp = scanner.nextInt();
while (tipp != cel)


            if (tipp < cel) {
                System.out.println("Az a szám, amire én gondoltam nagyobb, mint a tipped.");
                tipp = scanner.nextInt();
            }
              else   if (tipp > cel) {
                    System.out.println("Az a szám, amire én gondoltam, kisebb mint a te tipped.");
                    tipp = scanner.nextInt();
            } else if (tipp == cel) {
                System.out.println("Eltaláltad! ez a jó tipp!");
                return;
            }

   }

}
