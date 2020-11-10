package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg felhasználónevét:");
        String username = scanner.nextLine();
        System.out.println("Kérem adja meg jelszavát: (a jelszó legyen legalább 8 karakter)");
        String password1 = scanner.nextLine();
        System.out.println("Kérem adja meg jelszavát mégegyszer:");
        String password2 = scanner.nextLine();
        System.out.println("Kérem adja meg email címét:");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(username) ? "felhasználónév rendben" : "felhasználónév helytelen");
        System.out.println(userValidator.isValidPassword(password1, password2) ? "jelszó egyezik" : "jelszó helytelen");
        System.out.println(userValidator.isValidEmail(email) ? "e-mail helyes" : "e-mail helytelen formátumban került megadásra");

    }
}
