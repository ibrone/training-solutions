package classtructureattributes;


import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Kérem a nevét");
        client.name = scanner.nextLine();
        System.out.println("Kérem a lakcímét:");
        client.adress = scanner.nextLine();

        System.out.println("Kérem a születési évét:");
        client.year = scanner.nextInt();



        System.out.println("A neve:" +client.name);
        System.out.println("A lakcíme:" +client.adress);
        System.out.println("Születési éve:" + client.year);
    }
    }

