package Work1;

import java.lang.*;
public class Balls {
    public static void main(String[] args){
        Ball n1= new Ball("Red",28.0);
        Ball n2= new Ball("White",29.0);
        Ball n3= new Ball("Blue",28.0);
        n2.Set_V(26.0);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        n2.Set_V(284.0);
        n2.Set_Color("Purple");
        System.out.println(n2);
    }
}
