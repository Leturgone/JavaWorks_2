package Work20.work204;

public class Calculator {
    public <T extends Number,V extends Number> double sum(T num1, V num2){
        return num1.doubleValue() + num2.doubleValue();//преобразование в тип дабл
    }
    public <T extends Number,V extends Number> double multiply(T num1, V num2){
        return num1.doubleValue()*num2.doubleValue();//преобразование в тип дабл
    }
    public <T extends Number,V extends Number> double divide(T num1, V num2){
        return num1.doubleValue()/num2.doubleValue();//преобразование в тип дабл
    }
    public <T extends Number,V extends Number> double subtraction(T num1, V num2){
        return num1.doubleValue()-num2.doubleValue();//преобразование в тип дабл
    }
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        int num1=5;
        double num2=2.5;
        System.out.println("Sum: "+calc.sum(num1,num2));
        System.out.println("Multiply: "+calc.multiply(num1,num2));
        System.out.println("Divide: "+calc.divide(num1,num2));
        System.out.println("Subtraction: "+calc.subtraction(num1,num2));

    }

}
