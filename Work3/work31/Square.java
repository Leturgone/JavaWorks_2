package Work3.work31;

public class Square extends Shape{
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
        return (x*x);
    }
}
