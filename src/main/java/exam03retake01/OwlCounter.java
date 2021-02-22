package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OwlCounter {

    public List<String> readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine())  != null) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
            new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
