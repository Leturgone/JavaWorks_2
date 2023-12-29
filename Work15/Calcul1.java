package Work15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calcul1 extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Addition");
    JButton button2 = new JButton("  Subtraction");
    JButton button3 = new JButton("  Multiplication");
    JButton button4 = new JButton("  Division");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    //начало конструктора класса LabExample
    Calcul1() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
// создаем надпись 1
        add(new JLabel("1st Number"));
// добавляем текстовое поле jta1
        add(jta1);
// создаем надпись 2
        add(new JLabel("2nd Number"));
// добавляем текстовое поле jta2
        add(jta2);
// добавляем кнопку
        add(button);
        add(button2);
        add(button3);
        add(button4);
//добавляем слушателя к кнопке
        button.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());//переменная для хранения ввода в текстовое поле 1
                    double x2 = Double.parseDouble(jta2.getText().trim());//переменная для хранения ввода в текстовое поле 2
                    // создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        button2.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());//переменная для хранения ввода в текстовое поле 1
                    double x2 = Double.parseDouble(jta2.getText().trim());//переменная для хранения ввода в текстовое поле 2
                    // создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());//переменная для хранения ввода в текстовое поле 1
                    double x2 = Double.parseDouble(jta2.getText().trim());//переменная для хранения ввода в текстовое поле 2
                    // создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());//переменная для хранения ввода в текстовое поле 1
                    double x2 = Double.parseDouble(jta2.getText().trim());//переменная для хранения ввода в текстовое поле 2
                    // создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    } // конец конструктора

public static void main(String[]args){
        new Calcul1();
    } // конец main()
} // конец класса LabExample