package exam03retake01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OwlCounter {


    public List<String> readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }



    public static void main var strings = (List<String>) {;
        try (BufferedReader reader = Files.newBufferedReader(Path.of("owls.txt"))) {
            new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }


    public void getNumberOfOwls() {


            }
        }
    }