package Work13.work131;

import java.util.Scanner;

public class task1 {
    public task1(){}

    //Распечатать последний символ строки. Используем метод String.charAt()
    public void Smetod(String letter){
        System.out.print("последний символ строки: "+letter.charAt(letter.length()-1)+"\n");
    }

    //Проверить, заканчивается ли ваша строка подстрокой “!!!”.
    //Используем метод String.endsWith().
    public void Check_method(String letter){
        if (letter.endsWith("!!!")){
            System.out.print("Строка заканчивается на !!!"+"\n");
        }
        else{
            System.out.print("Строка не заканчивается на !!!"+"\n");
        }
    }
    //Проверить, начинается ли ваша строка подстрокой “I like”.
    //Используем метод String.startsWith().
    public void Check_method2(String letter){
        if (letter.startsWith("I like")){
            System.out.print("Строка начниется с I like"+"\n");
        }
        else{
            System.out.print("Строка не начниется с I like"+"\n");
        }
    }
    //Проверить, содержит ли ваша строка подстроку “Java”. Используем
    //метод String.contains()
    public void Check_method3(String letter){
        if (letter.contains("Java")){
            System.out.print("Строка содержит Java"+"\n");
        }
        else{
            System.out.print("Строка не содержит Java"+"\n");
        }
    }
    //Найти позицию подстроки “Java” в строке “I like Java!!!”.
    public void find_Java(String letter){
        int z=letter.indexOf("Java");
        if(z!=-1) {
            System.out.print("Позиция подстроки Java " + z + "\n");
        }
        else{
            System.out.print("Строка не содержит подстроку Java\n");
        }
    }
    //Заменить все символы “а” на “о”
    public void replase_a_to_o(String letter){
        letter = letter.replace("a","o");
        System.out.println("Строка с заменой: "+letter+"\n");
    }
    public void upper(String letter){
        letter = letter.toUpperCase();
        System.out.println("Строка с заменой: "+letter+"\n");
    }

    public void lower(String letter){
        letter = letter.toLowerCase();
        System.out.println("Строка с заменой: "+letter+"\n");
    }
    //Вырезать строку Java c помощью метода String.substring().

    public void cut_java(String letter){
        int n=letter.indexOf("Java");
        int k=n+4;
        if(n!=-1) {
            String letter1 = letter.substring(0, n);
            String letter2 = letter.substring(k, letter.length());
            System.out.println("Новая строка : " + letter1 + " " + letter2);
        }
        else{
            System.out.println("Нет строки Java");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String let = console.nextLine();
        task1 S=new task1();

        S.Smetod(let);
        S.Check_method(let);
        S.Check_method2(let);
        S.Check_method3(let);
        S.find_Java(let);
        S.replase_a_to_o(let);
        S.upper(let);
        S.lower(let);
        S.cut_java(let);

    }
}
