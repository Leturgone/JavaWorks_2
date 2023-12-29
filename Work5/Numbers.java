package Work5;

import java.util.Scanner;

public class Numbers {
    public static void fun(int n,int count){
        if(n/count!=0){
            fun(n,count*10);//идем до страшего
        }
        n%=count;
        count/=10;
        System.out.println(n/count);

    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        fun(num,10);
    }
}
