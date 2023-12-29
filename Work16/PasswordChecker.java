package Work16;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame {
    private JPanel panel;
    private JLabel loginLabel;
    private JTextField loginField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel siteLabel;
    private JTextField siteField;
    private JButton checkButton;

    public PasswordChecker() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        siteLabel = new JLabel("Сервис:");
        panel.add(siteLabel);

        siteField = new JTextField(20);
        panel.add(siteField);

        loginLabel = new JLabel("Введите логин:");
        panel.add(loginLabel);
        loginField = new JTextField(20);
        panel.add(loginField);

        passwordLabel = new JLabel("Введите пароль:");
        panel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        panel.add(passwordField);

        checkButton = new JButton("Проверить");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                if (password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Пароль верный!");
                } else {
                    JOptionPane.showMessageDialog(null, "Пароль неверный!");
                }
            }
        });
        setSize(350, 200);
        panel.add(checkButton);

        add(panel);
        setTitle("Проверка пароля");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PasswordChecker();
    }
}

