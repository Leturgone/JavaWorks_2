package Work12.work122;

import javax.swing.*;
import java.util.Scanner;

public class ImageMon extends JFrame {
    public ImageMon(String path){
        JFrame frame = new JFrame("Картиночка");
        JLabel label = new JLabel(new ImageIcon(path));
        frame.add(label);
        frame.pack();//Размеры в соотетсвии с картинкой
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Введите путь: ");
        Scanner console = new Scanner(System.in);
        String path = console.next();
        new ImageMon(path);
    }
}
