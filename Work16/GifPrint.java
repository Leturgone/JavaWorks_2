package Work16;

import javax.swing.*;
import java.net.URL;
import java.util.Scanner;

public class GifPrint extends JFrame {
    public GifPrint(String url) {
        try {
            URL gifUrl = new URL(url);
            Icon icon = new ImageIcon(gifUrl);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame("Гифочка");
            f.getContentPane().add(label);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setResizable(false);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (Exception e) {
            System.out.println("Ошибка при загрузке гиф-изображения: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите ссылку на гифку: ");
        Scanner console = new Scanner(System.in);
        String url = console.next();
        new GifPrint(url);
    }
}

