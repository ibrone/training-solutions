package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public int menupont;

        public static void main(String[] args) {

            System.out.println("1. Felhasználók listázása");
            System.out.println("2. Felhasználó felvétele");
            System.out.println("Többi: kilépés");
            System.out.println("Kérjük adja meg melyik menüpontot választja:");
            Scanner scanner = new Scanner(System.in);
            int menupont = scanner.nextInt();

                if (menupont == 1){
                    System.out.println("1. Felhasználók listázása menü");

                }
                if (menupont == 2){
                    System.out.println("2. Felhasználó felvétele menü");
                }

    }



    }

