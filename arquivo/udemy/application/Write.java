package arquivo.udemy.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String[] lines = new String[] {
            "Good morning",
            "Good afternoon",
            "Good night"
        };

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true ))) {
            /*Com o parametro true ele apenas adiciona*/
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
