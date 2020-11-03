package classtructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book ("Milne", "Micimackó");
        book.register("1");
        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("Kötet címe: " + book.getTitle());
        System.out.println("Regszáma:" + book.getRegNumber());
    }
}
