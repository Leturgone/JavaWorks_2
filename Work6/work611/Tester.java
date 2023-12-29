package Work6.work611;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        TemConvert temp=new TemConvert();
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        temp.convert(num);
    }
}
