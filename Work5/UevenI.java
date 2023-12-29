package Work5;

import java.util.Scanner;

public class UevenI {
    public static void fun(){
        Scanner console = new Scanner(System.in);
        int sequence = console.nextInt();
        if (sequence==0){
            return;
        }
        else{
            System.out.println("   "+sequence);
            sequence = console.nextInt();
            if (sequence==0){
                return;
            }
            fun();


        }
    }
    public static void main(String[] args){
        fun();
    }
}
