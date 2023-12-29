package Work12.work121;

import java.awt.Color;
import java.awt.Graphics2D;
abstract class Shape {
    protected Color color;
    protected int x;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public abstract boolean intersects(Shape other);
    protected int y;
    public abstract int getSize();
    public abstract int getX();

    public abstract void setX(int x);

    public abstract int getY();

    public abstract void setY(int y);
    public abstract void draw(Graphics2D g2d);
}
