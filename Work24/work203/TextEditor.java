package Work24.work203;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor extends App{
    @Override
    public void NewFunc() {
        JMenuItem newMenuItem = new JMenuItem("Новый");
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateTextDocument().CreateDoc("D:/Учеба/2 курс/1 сем/Java/DZ/src/Work24/work203/file.txt");
            }
        });
        fileMenu.add(newMenuItem);
    }
    @Override
    public void OpenFunc() {
        JMenuItem openMenuItem = new JMenuItem("Открыть");
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = "D:/Учеба/2 курс/1 сем/Java/DZ/src/Work24/work203/file.txt"; // Замените "путь_к_файлу" на конкретный путь к файлу

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    StringBuilder sb = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append("\n");
                    }

                    textArea.setText(sb.toString()); // Вывод текста в окошко
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        fileMenu.add(openMenuItem);
    }
    @Override
    public void SaveFunc(){
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("D:/Учеба/2 курс/1 сем/Java/DZ/src/Work24/work203/file.txt");
                    writer.write(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        fileMenu.add(saveMenuItem);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TextEditor t=new TextEditor();
                t.Create();
                t.setVisible(true);
            }
        });
    }
}
