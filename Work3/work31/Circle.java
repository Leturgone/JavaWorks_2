package Work3.work31;
public class Circle extends Shape {
    private int x;
    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return this.x;
    }
    @Override
    public double S(){
        return (3.14*x*x);
    }
}
