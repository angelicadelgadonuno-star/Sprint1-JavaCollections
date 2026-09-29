package Nivel1.CapitalGame;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocsManagement {

    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read document: " + fileName);
        }
        return lines;
    }

    public void writeFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            System.out.println("Unable to write file: " + fileName);
        }
    }
}




