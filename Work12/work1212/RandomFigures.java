package Work12.work1212;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomFigures extends JFrame {
    public static final int WIDTH = 1000;

    public static final int HEIGHT = 500;

    private ArrayList<Position> posTaken = new ArrayList<>();

    public RandomFigures() {
        JFrame frame = new JFrame("Random Shapes");
        setResizable(false);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        int i = 0;
        while (true) {
            createRandomShape();
            i++;
        }
//        Random random = new Random();
//        int SHAPE_COUNT =random.nextInt(100);
//        while (i<SHAPE_COUNT){
//            createRandomShape();
//            i++;
//        }
    }

    private void createRandomShape() {
        Random random = new Random();

        int randX;
        int randY;

        while (true) {
            randX = random.nextInt(WIDTH) + 1;
            randY = random.nextInt(HEIGHT) + 1;

            if (randX + 50 > WIDTH) {
                randX -= 50;
            }

            if (randX < 0) {
                randX = 0;
            }

            if (randY + 50 > HEIGHT) {
                randY -= 50;
            }

            if (randY < 0) {
                randY = 0;
            }

            boolean test = checkCols(randX, randY);

            if (test) {
                posTaken.add(new Position(randX, randY));

                break;
            }
        }
        //Создание фигур
        int random_shape = random.nextInt(3);
        Color randomColor = new Color(random.nextFloat(),random.nextFloat(), random.nextFloat());
        Shape shape;
        switch (random_shape) {
            case 0: {
                shape = new Rectangle(randomColor, new Position(randX, randY), this.getGraphics());
                break;
            }
            case 1: {
                shape = new Circle(randomColor, new Position(randX, randY), this.getGraphics());
                break;
            }
            case 2: {
                shape = new Triangle(randomColor, new Position(randX, randY), this.getGraphics());
                break;
            }
            default: {
                return;
            }
        }

        shape.draw();
    }
    public boolean valueInRange(int v, int min, int max) {
        return (v >= min) && (v <= max);
    }

    //Проверка не заходил ли за границы
    public boolean checkCols(int x, int y) {
        for (Position in : posTaken) {
            boolean xg = valueInRange(in.getX(), x, x + 50) || valueInRange(x, in.getX(), in.getX() + 50);
            boolean yg = valueInRange(in.getY(), y, y + 50) || valueInRange(y, in.getY(), in.getY() + 50);

            if (xg && yg) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        new RandomFigures();
    }
}

