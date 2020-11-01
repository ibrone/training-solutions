package classtructureio;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kérem adja meg a nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem adja meg e-mail címét:");
        String email = scanner.nextLine();

        System.out.println(name);
        System.out.println(email);



    }

}
