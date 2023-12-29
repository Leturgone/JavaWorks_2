package Work9.work678;

import java.util.Scanner;

public class Numbers {
    //2. Задание от 1 до n
    //Дано натуральное число n. Выведите все числа от 1 до n
    public static void fun(int current, int n){
        if (current > n) {
            return;
        }

        System.out.println(current);
        fun(current + 1, n);

    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        fun(1,num);
    }

}
