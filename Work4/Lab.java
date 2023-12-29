package Work4;
import java.awt.*;

import javax.swing.*;

public class Lab extends JFrame{
    JTextField jta = new JTextField(30);//длинна окна ввода
    Font fnt = new Font("Times new roman", Font.BOLD,20);//текст
    Lab(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(500,200);//разрешение окна
        add(jta);
        jta.setForeground(Color.PINK);//цвет шрифта
        jta.setFont(fnt);//смена шрифта
        setVisible(true);
    }
    public static void main(String[]args) {
        new Lab();
    }
}
