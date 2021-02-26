package exam03retake02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BalatonStorm {


    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("storm.json")))) {
            new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
