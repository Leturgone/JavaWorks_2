package Work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Work3 {
    public static void main(String[] args) {
        final String[] copy_item = new String[1];
        JFrame frame = new JFrame("Программа");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,2 ));

        JButton button1 = new JButton("Button 1");
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        panel.add(button2);

        JTextArea textArea = new JTextArea();
        panel.add(textArea);


        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);

        JMenuItem saveItem = new JMenuItem("Сохранить");
        fileMenu.add(saveItem);
        saveItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                String text = textArea.getText();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
                    writer.write(text);
                    writer.close();
                    JOptionPane.showMessageDialog(frame, "Файл успешно сохранен!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Ошибка при сохранении файла!");
                    throw new RuntimeException(ex);
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        JMenu editMenu = new JMenu("Правка");
        menuBar.add(editMenu);

        JMenuItem copyItem = new JMenuItem("Копировать");
        editMenu.add(copyItem);
        copyItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                copy_item[0] = textArea.getSelectedText();
            }
        });

        JMenuItem cutItem = new JMenuItem("Вырезать");
        editMenu.add(cutItem);
        cutItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                copy_item[0] = textArea.getSelectedText();
                textArea.replaceSelection("");
            }
        });
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editMenu.add(pasteItem);
        pasteItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                String text = copy_item[0];
                textArea.insert(text, textArea.getCaretPosition());
            }
        });

        JMenu helpMenu = new JMenu("Справка");
        menuBar.add(helpMenu);

        frame.getContentPane().add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

