package GUI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GravarArquivo {
    public void escreverLog(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userLog.txt", true));) {
            writer.write("\n"+line);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader reader = new BufferedReader(new FileReader("userLog.txt"))) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
