package Work7.work74;


public class Tester {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        // Тестирование метода degree()
        double number = 2.0;
        int degree = 3;
        double result = mathFunc.degree(number, degree);
        System.out.println("Результат возведения в степень: " + result);
        // Ожидаемый результат: 8.0

        // Тестирование метода find_S()
        double R = 5.0;
        double s = mathFunc.find_S(R);
        System.out.println("Площадь круга: " + s);
        // Ожидаемый результат: 78.53981633974483
    }
}