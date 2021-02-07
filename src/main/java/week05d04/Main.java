package week05d04;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Product(300,Currency.HUF).converPrice(Currency.USD));
        System.out.println(new Product(100,Currency.USD).converPrice(Currency.HUF));

    }
}
