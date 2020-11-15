package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Kérem adja meg az öt összeadásra kerülő számot!");
        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i < 5; i++){
            System.out.println("Adja meg a(z)" + (i + 1) + ". számot:");
        int number = scanner.nextInt();
        sum += number;

        }
        System.out.println("A számok összege: " + sum);
    }
}
