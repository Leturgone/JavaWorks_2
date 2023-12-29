package Work11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt()-1; // Calendar.MONTH начинается с  0

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        // Создание объекта Date
        Date date = new Date(year - 1900, month, day, hours, minutes);

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        SimpleDateFormat formatter = new SimpleDateFormat("<yyyy><MM><dd>\n<HH><mm>");
        System.out.println("Объект Date: \n" + formatter.format(date));
        System.out.println("Объект Calendar: \n" + formatter.format(calendar.getTime()));
    }
}
