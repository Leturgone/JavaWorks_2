package Work7.work72;


public class MovablePoint implements Movable {
    public String Int_to_string(int number){
        return String.valueOf(number);
    }
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        if(xSpeed==ySpeed){
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
    }
    private boolean SpeedTest(){
        if(xSpeed==ySpeed){
            return true;
        }
        else{
            return false;
        }
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
