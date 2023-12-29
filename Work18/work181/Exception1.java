package Work18.work181;

import Work17.work173.GUIModel;
import Work17.work173.GUIModelControler;
import Work17.work173.GUIModelView;

public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        //Вызыается ошибка деления на 0
        Exception1 ob=new Exception1();
        ob.exceptionDemo();
    }
}

