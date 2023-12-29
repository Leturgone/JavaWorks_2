package Work3.work32;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length, String color,boolean filled){
        this.width=width;
        this.filled=filled;
        this.color=color;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle "+"color: "+this.color+" Length: "+this.length+" Width "+this.width;
    }
}
