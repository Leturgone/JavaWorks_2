package Work22.work202;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    private JTextField expressionTextField;
    private JPanel jPanel = new JPanel();
    private JButton[] jButtons;
    private Stack<Double> operandStack = new Stack<>();
    private StringBuilder currentExpression = new StringBuilder();

    public Calculator() {
        this.setTitle("Калькулятор");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);

        expressionTextField = new JTextField(30);
        expressionTextField.setText("");
        expressionTextField.setEditable(false);
        this.add(expressionTextField, "North");

        jPanel.setLayout(new GridLayout(5, 4, 3, 3));
        String name[] = {
                "C", "/", "*","-",
                "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "0",
                "%","+", "="
        };
        jButtons = new JButton[name.length];
        MyActionListener actionListener = new MyActionListener();

        for (int i = 0; i < name.length; i++) {
            jButtons[i] = new JButton(name[i]);
            jButtons[i].addActionListener(actionListener);
            jButtons[i].setBackground(Color.PINK);
            if (isNumeric(name[i]))
                jButtons[i].setBackground(Color.LIGHT_GRAY);
            jPanel.add(jButtons[i]);
        }
        this.add(jPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();

            if (isNumeric(input)) {
                double number = Double.parseDouble(input);
                operandStack.push(number);
                currentExpression.append(input);
            }
            else if (isOperator(input)) {
                if (operandStack.size() >= 2) {
                    double result = performOperation(input);
                    operandStack.push(result);
                    currentExpression.append(" ").append(input);
                }
            } else if (input.equals("=")) {
                if (!operandStack.isEmpty()) {
                    double result = operandStack.pop();
                    currentExpression.append(" = ").append(getNumber(Double.toString(result)));
                }
            } else if (input.equals("C")) {
                operandStack.clear();
                currentExpression.setLength(0);
            }
            expressionTextField.setText(currentExpression.toString());
        }
    }

    private boolean isNumeric(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isOperator(String input) {
        return "+-*/".contains(input);
    }

    private double performOperation(String operator) {
        if (operandStack.size() < 2) {
            return 0;
        }

        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }
    public static String getNumber(String number) {
        return BigDecimal.valueOf(Double.parseDouble(number)).stripTrailingZeros().toPlainString();
    }

    public static void main(String[] args) {
        new Calculator();
    }
}