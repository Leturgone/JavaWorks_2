package Work1;

import java.lang.*;

public class Ball{
    private String color;
    private double V;
    public Ball(String c,double v ){
        color =c;
        V=v;
    }
    public  void Set_Color(String color){
        this.color= color;
    }
    public  void Set_V(double V){
        this.V= V;
    }
    public String Get_Color(){
        return color;
    }
    public double Get_V(){
        return V;
    }

    public String toString(){
        return "color: "+this.color+ " V: "+this.V;
    }
}