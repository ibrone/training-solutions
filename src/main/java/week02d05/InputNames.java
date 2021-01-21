package week02d05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputNames {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] names = new String[5];
        for (int i = 0; i <5; i++) {
            int g = i+1;
            System.out.println("Kérem az " + g + ". nevet:");
            names[i]= scanner.nextLine();
        }
        System.out.println("A tömbbe felvett nevek:");

        for (int i = 0; i <5; i++) {
            System.out.println(names[i]);

        }
        return;

    }
}
