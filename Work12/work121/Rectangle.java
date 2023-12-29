package Work12.work121;

import java.awt.*;

class Rectangle extends Shape {
    private Color color;
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color,x,y);
        this.color=color;
        this.width = width;
        this.height = height;
    }
    @Override
    public int getSize() {
        return width;
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

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);

        int[] xPoints = {x - width / 2, x + width / 2, x};
        int[] yPoints = {y + height / 2, y + height / 2, y - height / 2};
        Polygon triangle = new Polygon(xPoints, yPoints, 3);

        g2d.fill(triangle);
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