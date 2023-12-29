package Work12.work121;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

class Circle extends Shape {
    private int radius;
    private Color color;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Color color, int x,int y,int size) {
        super(color,x,y);
        this.radius =size;
    }


    @Override
    public int getSize() {
        return radius;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public int getY() {
        return y;
    }
    @Override
    public void setY(int y) {
        this.y=y;
    }
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2));
    }
    @Override
    public boolean intersects(Shape other) {
        int x1 = this.getX();
        int y1 = this.getY();
        int size1 = this.getSize();
        int x2 = other.getX();
        int y2 = other.getY();
        int size2 = other.getSize();
        boolean xOverlap = Math.abs(x1 - x2) <= (Math.max(size1, size2));
        boolean yOverlap = Math.abs(y1 - y2) <= (Math.max(size1, size2));
        return xOverlap && yOverlap;
    }
}

