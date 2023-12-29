package Work5;
//12,13,14

import java.util.Scanner;

public class  Uneven{
    public static void fun(){
        Scanner console = new Scanner(System.in);
        int sequence = console.nextInt();
        if (sequence==0){
            return;
        }
        else{
            if (sequence%2!=0){
                System.out.println("   "+sequence);
            }
            fun();
        }
    }
    public static void main(String[] args){
        fun();
    }
}


