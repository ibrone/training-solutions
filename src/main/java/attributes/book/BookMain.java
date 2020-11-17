package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book ("101 kiskutya");

        System.out.println(book.getTitle());

        book.setTitle("102 kiskutya");
        System.out.println(book.getTitle());
    }

}
