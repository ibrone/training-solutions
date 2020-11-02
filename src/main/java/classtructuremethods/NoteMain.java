package classtructuremethods;
import java.util.Scanner;
public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
Scanner scanner = new Scanner(System.in);

        System.out.println("Név:");
String name = scanner.nextLine();
        System.out.println("Téma:");
        String topic = scanner.nextLine();
        note.setTopic(topic);
        System.out.println("Jegyzet szövege:");
        String text = scanner.nextLine();

        System.out.println(note.getNoteText());
    }



}
