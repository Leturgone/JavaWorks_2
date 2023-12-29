package Work11;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CompareDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате dd.MM.yyyy): ");
        String userInput = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date userDate;
        try {
            userDate = dateFormat.parse(userInput);
        } catch (Exception e) {
            System.out.println("Ошибка при вводе даты");
            return;
        }
        System.out.println("Введенная дата: "+ userDate);
        Date currentDate = new Date();
        System.out.println("Текущая дата: "+ currentDate);
        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата раньше текущей даты");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата позже текущей даты");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой");
        }
    }
}
