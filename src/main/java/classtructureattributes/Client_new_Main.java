package classtructureattributes;

import java.util.Scanner;

public class Client_new_Main {

    public static void main(String[] args) {
        Client_new client = new Client_new();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a kliens nevét");
        client.name = scanner.nextLine();
        System.out.println("Kérem a kliens címét:");
        client.address = scanner.nextLine();
        System.out.println("Kérem a kliens születési évét:");
        client.year = scanner.nextInt();


        System.out.println("Az adatok: " + client.name + client.address + client.year);
    }
}
