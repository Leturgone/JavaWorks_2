package Work3.work32;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        this.length=side;
        this.width=side;
    }
    public Square(double side, String color,boolean filled){
        this.length=side;
        this.width=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length=side;
        this.width=side;
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }
    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "Shape: square "+"color: "+this.color+" Length: "+this.length+" Width "+this.width;
    }
}
