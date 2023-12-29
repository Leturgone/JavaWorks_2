package Work16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessGame {
    private static final int MAX_POPITKI = 3;
    private static final int RANDOM_NUMBER = (int) (Math.random() * 21);

    private int attemptsLeft;

    public GuessGame() {
        attemptsLeft = MAX_POPITKI;
    }

    public void start() {
        JFrame frame = new JFrame("Игра Угадайка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel promptLabel = new JLabel("Угадайте число от 0 до 20:");
        frame.add(promptLabel, BorderLayout.NORTH);

        JTextField textField = new JTextField(10);
        frame.add(textField, BorderLayout.CENTER);

        JButton button = new JButton("Угадать");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(textField.getText());
                checkGuess(guess);
            }
        });
        frame.add(button, BorderLayout.SOUTH);

        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void checkGuess(int guess) {
        if (guess == RANDOM_NUMBER) {
            showMessageBox("Ура победа, вы угадали число !");
            System.exit(0);
        } else if (attemptsLeft == 1) {
            showMessageBox("Игра окончена, вы не угадали число. Загаданное число это " + RANDOM_NUMBER + ".");
            System.exit(0);
        } else {
            attemptsLeft--;
            String message = "Неправильно. ";
            if (guess < RANDOM_NUMBER) {
                message += "Загаданное число больше чем " + guess + ".";
            } else {
                message += "Загаданное число меньше чем " + guess + ".";
            }
            showMessageBox(message);
        }
    }

    private void showMessageBox(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.start();
    }
}

