package Work24.work203;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TextDocument implements IDocument {
    private File file;

    public TextDocument(String filePath) {
        file = new File(filePath);
    }

    // Другие методы и функции для работы с текстовым файлом...

    public String readText() throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        }
        return content.toString();
    }

    public void writeText(String text) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        }
    }
}
