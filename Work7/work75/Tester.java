package Work7.work75;


public class Tester {
    public static void main(String[] args) {
        String str = "Test";
        ProcessStrings processStrings=new ProcessStrings();
        System.out.println("Количество символов: "+processStrings.char_calc(str));
        System.out.println("Инвертированная строка: "+processStrings.reverse(str));
        System.out.println("Строка из нечетных символов: "+processStrings.nechet_str(str));
    }
}
