package classtructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Kovács Saniy");
        client.setYear(1983);
        client.setAddress("2030 Érd Ripityom utca 3");

        System.out.println("Neve: " + client.getName());
        System.out.println("Születési éve: " + client.getYear());
        System.out.println("Lakcíme:" + client.getAddress());
client.migrate("1146 Budapest Elköltözött utca 3");
        System.out.println("Új lakcíme: " + client.getAddress());
    }


}
