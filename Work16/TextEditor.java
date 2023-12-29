package Work16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public TextEditor() {
        setTitle("Редактор Текста");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);


        JMenuItem blueItem = new JMenuItem("Синий");
        colorMenu.add(blueItem);

        blueItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                textArea.setForeground(Color.BLUE);
            }
        });


        JMenuItem redItem = new JMenuItem("Красный");
        colorMenu.add(redItem);
        redItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                textArea.setForeground(Color.RED);
            }
        });

        JMenuItem blackItem = new JMenuItem("Черный");
        colorMenu.add(blackItem);
        blackItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                textArea.setForeground(Color.BLACK);
            }
        });

        fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        fontMenu.add(timesNewRomanItem);
        timesNewRomanItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                Font font = new Font("Times New Roman", Font.PLAIN, 12);
                textArea.setFont(font);
            }
        });


        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");

        fontMenu.add(msSansSerifItem);

        msSansSerifItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                Font font = new Font("MS Sans Serif", Font.PLAIN, 12);
                textArea.setFont(font);
            }
        });

        JMenuItem courierNewItem = new JMenuItem("Courier New");

        fontMenu.add(courierNewItem);
        courierNewItem.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                Font font = new Font("Courier New", Font.PLAIN, 12);
                textArea.setFont(font);
            }
        });
    }

    public static void main(String[] args) {
        TextEditor example = new TextEditor();
        example.setVisible(true);
    }

}

