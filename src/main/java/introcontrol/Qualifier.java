package introcontrol;

import java.util.Scanner;

public class Qualifier {
    private int i;
    public static void main(String[] args) {



        System.out.println("Kérem adjon meg egy számot:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i>100){
            System.out.println("Nagyobb mint száz az érték, amit megadott");
        }
        else
            System.out.println("A szám kisebb vagy egyenlő mint 100");
    }

}
