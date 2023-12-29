package Work6.work62;


public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "X= "+this.x+" Y= "+this.y+" xSeed= "+this.xSpeed+" ySpeed= "+this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.x=this.x-this.ySpeed;
    }
    @Override
    public void moveUp() {
        this.x=this.x+this.ySpeed;
    }
    @Override
    public void moveLeft() {
        this.x=this.x+this.xSpeed;
    }
    @Override
    public void moveRight() {
        this.x=this.x-this.xSpeed;
    }
}
