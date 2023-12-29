package Work15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//SimpleCalc extends and inherits the JFrame functionality

public class Calculator extends JFrame {

    //Объявляем все кнопки
    private JButton bNum1;
    private JButton bNum2;
    private JButton bNum3;
    private JButton bNum4;
    private JButton bNum5;
    private JButton bNum6;
    private JButton bNum7;
    private JButton bNum8;
    private JButton bNum9;
    private JButton bNum0;
    private JButton bAdd;
    private JButton bSubtract;
    private JButton bMultiply;
    private JButton bDivide;
    private JButton bSolve;
    private JButton bDecimal;
    private double TEMP;
    private double START;
    private double SolveTEMP;
    private JTextField Result;

    private boolean addBool = false; //operation
    private boolean subBool = false; //operation
    private boolean divBool = false; //operation
    private boolean mulBool = false; //operation
    private boolean operatorClicked = false; //has an operator been clicked yet
    private boolean justSolved = false; //just solved (user entered equal)


    String display = "0";

    //constructor for SimpleCalc
    public Calculator() {
        JPanel p1 = new JPanel();
        //Добавление панелей с цифрами и операциями
        p1.setLayout(new GridLayout(4, 4));
        p1.add(bNum7 = new JButton("7"));
        p1.add(bNum8 = new JButton("8"));
        p1.add(bNum9 = new JButton("9"));
        p1.add(bDivide= new JButton("/"));
        p1.add(bNum4 = new JButton("4"));
        p1.add(bNum5 = new JButton("5"));
        p1.add(bNum6 = new JButton("6"));
        p1.add(bMultiply = new JButton("*"));
        p1.add(bNum1 = new JButton("1"));
        p1.add(bNum2 = new JButton("2"));
        p1.add(bNum3 = new JButton("3"));
        p1.add(bSubtract = new JButton("-"));
        p1.add(bNum0 = new JButton("0"));
        p1.add(bDecimal = new JButton("."));
        p1.add(bSolve = new JButton("="));
        p1.add(bAdd = new JButton("+"));

        //Окно с результатом
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(Result = new JTextField(60));
        Result.setHorizontalAlignment(JTextField.RIGHT);
        Result.setEditable(false);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.CENTER);
        add(p);
        setSize(100, 500);
        setResizable(false);
        setVisible(true);

        //Добавляем слушателей к кнопкам
        bNum1.addActionListener(new ListenToButton());
        bNum2.addActionListener(new ListenToButton());
        bNum3.addActionListener(new ListenToButton());
        bNum4.addActionListener(new ListenToButton());
        bNum5.addActionListener(new ListenToButton());
        bNum6.addActionListener(new ListenToButton());
        bNum7.addActionListener(new ListenToButton());
        bNum8.addActionListener(new ListenToButton());
        bNum9.addActionListener(new ListenToButton());
        bNum0.addActionListener(new ListenToButton());

        bDecimal.addActionListener(new ListenToButton());
        bAdd.addActionListener(new ListenToAdd());
        bSubtract.addActionListener(new ListenToSubtract());
        bMultiply.addActionListener(new ListenToMultiply());
        bDivide.addActionListener(new ListenToDivide());
        bSolve.addActionListener(new ListenToSolve());
    }
    //Релизация функций
    class ListenToButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = Result.getText();
            JButton button = (JButton)e.getSource();
            String buttonLabel = button.getText();
            if (justSolved) {
                justSolved = false;
                Result.setText(buttonLabel);
                operatorClicked = false;

            }
            else if ((operatorClicked)) {
                Result.setText(buttonLabel);
                operatorClicked = false;
            }
            else if (display.equals("0")) {
                Result.setText(buttonLabel);
            }
            else {
                Result.setText(display + buttonLabel);
            }

        }

    }

//    class ListenToPlusMinus implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            TEMP = Double.parseDouble(Result.getText());
//            TEMP = TEMP * -1;
//            roundCheck(TEMP);
//        }
//    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(Result.getText());
            solveMethod(TEMP);
            START = TEMP;
            addBool = true;
            operatorClicked = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(Result.getText());
            solveMethod(TEMP);
            START = TEMP;
            subBool = true;
            operatorClicked = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(Result.getText());
            solveMethod(TEMP);
            START = TEMP;
            mulBool = true;
            operatorClicked = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(Result.getText());
            solveMethod(TEMP);
            START = TEMP;
            divBool = true;
            operatorClicked = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(Result.getText() );
            solveMethodEquals(SolveTEMP);

        }
    }

    //this solve method is used every time an operator is called
    public void solveMethod(double d) {
        if ( addBool == true  ) {
            TEMP = TEMP + START;
        }
        else if ( subBool == true  ) {
            TEMP = START - TEMP;
        }
        else if ( mulBool == true  ) {
            TEMP = START * TEMP;
        }
        else if ( divBool == true  ) {
            TEMP = START / TEMP;
        }

        roundCheck(TEMP);
        addBool = false;
        subBool = false;
        mulBool = false;
        divBool = false;
        justSolved = true;
    }

    //Вычисление
    public void solveMethodEquals(double d) {
        if ( addBool == true  ) {
            SolveTEMP = TEMP + SolveTEMP;
        }
        else if ( subBool == true  ) {
            SolveTEMP = TEMP - SolveTEMP;
        }
        else if ( mulBool == true  ) {
            SolveTEMP = TEMP * SolveTEMP;
        }
        else if ( divBool == true  ) {
            SolveTEMP = TEMP / SolveTEMP;
        }

        roundCheck(SolveTEMP);
        addBool = false;
        subBool = false;
        mulBool = false;
        divBool = false;
        operatorClicked = false;
        justSolved = true;
    }

    public void roundCheck(double d) {
        if (d % 1 == 0) {
            int result = (int)d;
            Integer iresult = (Integer)result;
            Result.setText(Integer.toString(iresult));
        }
        else {
            Result.setText(Double.toString(d));
        }
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}