package Work6.work65;

public class MovableCircle {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "X: "+this.center.x+"Y: "+this.center.y+"X Speed: "+this.center.xSpeed+"Y Speed: "+this.center.ySpeed;
    }

    public void moveDown() {
        this.center.x=this.center.x-this.center.ySpeed;
    }
    public void moveUp() {
        this.center.x=this.center.x+this.center.ySpeed;
    }
    public void moveLeft() {
        this.center.x=this.center.x+this.center.xSpeed;
    }
    public void moveRight() {
        this.center.x=this.center.x-this.center.xSpeed;
    }

}
