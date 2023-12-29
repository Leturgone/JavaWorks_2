package Work24.work203;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class App extends JFrame {
    JMenu fileMenu;
    JTextArea textArea;
    public void Create() {
        setTitle("Редактор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        JMenuBar menuBar = new JMenuBar();
        fileMenu = new JMenu("Файл");
        NewFunc();
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        OpenFunc();
        SaveFunc();
        JMenuItem exitMenuItem = new JMenuItem("Выход");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }
    abstract public void NewFunc();
    abstract public void OpenFunc();
    abstract public void SaveFunc();

}
