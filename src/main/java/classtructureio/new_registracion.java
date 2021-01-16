package classtructureio;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class new_registracion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a felhasználó nevét:");
        String name = scanner.nextLine();
        System.out.println("Kérem az e-mail címét:");
        String email = scanner.nextLine();
        System.out.println("A regisztrációs adatai:");
        System.out.println("Regésztrált neve:" + name);
        System.out.println("Email címe:");
        System.out.println(email);
    }
}
