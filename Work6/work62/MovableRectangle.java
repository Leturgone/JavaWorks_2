package Work6.work62;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed, int ySpeed){
        if (xSpeed==ySpeed) {
            this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }
        else{
            System.out.println("Error: Both points must have the same speed");
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft: x: "+this.topLeft.x+" y: "+this.topLeft.y+" xSpeed: "+this.topLeft.xSpeed+" xSpeed: "+this.topLeft.ySpeed+
                ", bottomRight: x: "+this.bottomRight.x+" y: "+this.bottomRight.y+" xSpeed: "+this.bottomRight.xSpeed+" xSpeed: "+this.bottomRight.ySpeed+
                '}';
    }
    @Override
    public void moveUp(){
        topLeft.y=topLeft.y+topLeft.ySpeed;
        bottomRight.y=bottomRight.y+bottomRight.ySpeed;
    }
    @Override
    public void moveDown(){
        topLeft.y=topLeft.y-topLeft.ySpeed;
        bottomRight.y=bottomRight.y-bottomRight.ySpeed;
    }
    @Override
    public void moveLeft(){
        topLeft.x=topLeft.x+topLeft.xSpeed;
        bottomRight.x=bottomRight.x+bottomRight.xSpeed;
    }
    @Override
    public void moveRight(){
        topLeft.x=topLeft.x-topLeft.xSpeed;
        bottomRight.x=bottomRight.x-bottomRight.xSpeed;
    }
}