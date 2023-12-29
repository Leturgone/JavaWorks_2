package Work22.work201;

import java.util.Scanner;
import java.util.Stack;

public class PolCalc {
    public static double calcPol(String[] tokens) {
//        Класс Stack представляет собой стек объектов, хранящихся в режиме "последний-первый-выход" (LIFO).
//        Он расширяет класс Vector пятью операциями, которые позволяют рассматривать вектор как стек.
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            //Если число
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
                //Если оператор
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для оператора: " + token);
                }
                //Вытаскиваем числа из стека
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                //Считаем
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Недопустимый токен: " + token);
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Недостаточно операторов в выражении");
        }
        return stack.pop();
    }

    private static boolean isNumeric(String token) {//Проверка на число
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {//Проверка на оператор
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Недопустимый оператор: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение в обратной польской нотации: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] rpnExpression = input.split(" ");
        double result = calcPol(rpnExpression);
        System.out.println("Результат: " + result);
    }
}
