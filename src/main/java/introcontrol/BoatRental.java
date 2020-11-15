package introcontrol;

import java.util.Scanner;

public class BoatRental {
public int letszam;
    public static void main(String[] args) {

        System.out.println("Kérem az érkező csoport létszámát:");
        Scanner scanner = new Scanner(System.in);
        int letszam = scanner.nextInt();

        if (letszam >=10){
            letszam = letszam - 10;
            System.out.println("A parton fog maradni " + letszam  + " fő");
    }

    }



}
