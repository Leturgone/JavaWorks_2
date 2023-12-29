package Work12.work1212;

import java.awt.*;

public class Triangle extends Shape {
    Triangle(Color color, Position position, Graphics graphics) {

        super(color, position, graphics);
    }

    @Override
    public void draw() {
        int[] xPoints = {getPosition().getX(), getPosition().getX() + 25, getPosition().getX() + 50};
        int[] yPoints = {getPosition().getY() + 50, getPosition().getY(), getPosition().getY() + 50};

        getGraphics().setColor(getColor());
        getGraphics().drawPolygon(xPoints, yPoints, 3);
        getGraphics().fillPolygon(xPoints, yPoints, 3);
    }
}