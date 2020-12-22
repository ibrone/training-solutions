package numbers;
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        String feladat = "(8 - 2) + 3 * 2 / (4 - 3)";
        double eredmeny = (8 - 2) + 3 * 2 / (4 - 3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek számold ki, mi a következő egyenlet megoldása: " + feladat);


        double szamolas = scanner.nextDouble();

        if (Math.abs(eredmeny - szamolas) < 0.0001) {
            System.out.println("Jól számoltál!");
        } else {
            System.out.println("Számold újra");
        }
    }
}