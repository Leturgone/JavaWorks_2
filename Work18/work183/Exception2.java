package Work18.work183;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        //В Java, при обработке исключений, catch блоки должны быть упорядочены таким образом,
        // чтобы наиболее специфичные исключения обрабатывались перед более общими.
        catch (Exception e) {
        System.out.println("Exception error");
        }
//        catch(NumberFormatException e){
//            System.out.println("Неверный формат числа");
//        }
//        catch ( ArithmeticException e ) {
//            System.out.println("Attempted division by zero");
//        }
    }

    public static void main(String[] args) {
        //Вызыается ошибка деления на 0
        Exception2 ob=new Exception2();
        ob.exceptionDemo();
    }
}
