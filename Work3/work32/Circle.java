package Work3.work32;

import static java.lang.Math.pow;

public class Circle extends Shape {
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 3.14*pow(this.radius,2);
    }
    @Override
    public double getPerimeter(){
        return 2*3.14*this.radius;
    }

    @Override
    public String toString() {
        return "Shape: circle "+"radius: "+this.radius+" color: "+this.color;
    }
}
