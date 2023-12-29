package Work12.work121;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class RandomFigures extends JPanel {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 500;
    Random random = new Random();
    private int SHAPE_COUNT =random.nextInt(100);

    private Shape[] shapes;


    public RandomFigures () {
        shapes = new Shape[SHAPE_COUNT];
        Random random = new Random();

        for (int i = 0; i < SHAPE_COUNT; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int size = random.nextInt(50) + 10;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int z= random.nextInt(2);
            if (z==0) {
                shapes[i] = new Circle(color, x, y, size);
            }
            if(z==1){
                shapes[i] = new Triangle(color, x, y, size);
            }
            else {
                shapes[i] = new Rectangle(color, x, y, size, size);
            }
        }
    }
    public void moveShapeIfIntersects(Shape[] shapes, int index) {
        Shape currentShape = shapes[index];
        for (int i = 0; i < shapes.length; i++) {
            if (i != index) {
                Shape otherShape = shapes[i];
                if (currentShape.intersects(otherShape)) {
                    moveShape(currentShape);
                    moveShapeIfIntersects(shapes, index);
                    break;
                }
            }
        }
    }
    private void moveShape(Shape shape) {
        Random random = new Random();
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        int size = shape.getSize();

        if (x + size > WIDTH) {
            x = WIDTH -size ;
        }
        if (y + size > HEIGHT) {
            y = HEIGHT-size;
        }
        if (x - size < 0) {
            x =2*size;
        }
        if (y - size < 0) {
            y =2*size ;
        }

        shape.setX(x);
        shape.setY(y);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (int i=0;i<SHAPE_COUNT;i++) {
            Shape shape= shapes[i];
            //moveShape(shape);
            moveShapeIfIntersects(shapes, i);
            shape.draw(g2d);
        }
    }
}


