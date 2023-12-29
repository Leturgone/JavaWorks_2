package Work18.work184;

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
        catch(NumberFormatException e){
            System.out.println("Неверный формат числа");
        }
        catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
//        finally вызывается даже если возникнет исключение.
        finally {
            System.out.println("Finally block");
        }
    }

    public static void main(String[] args) {
        //Вызыается ошибка деления на 0
        Exception2 ob=new Exception2();
        ob.exceptionDemo();
    }
}
