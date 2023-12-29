package Work24.work203;

import Work24.work201.Complex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextDocument {

    public IDocument CreateDoc(String path) {
        String fileName = path; // Имя файла

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Пример текста в файле."); // Запись текста в файл
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
