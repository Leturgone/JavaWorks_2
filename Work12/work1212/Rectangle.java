package Work12.work1212;

import java.awt.*;

public class Rectangle extends Shape {
    Rectangle(Color color, Position position, Graphics graphics) {

        super(color, position, graphics);
    }

    @Override
    public void draw() {
        getGraphics().drawRect(getPosition().getX(), getPosition().getY(), 50,50);
        getGraphics().setColor(getColor());
        getGraphics().fillRect(getPosition().getX(), getPosition().getY(), 50, 50);
    }
}
