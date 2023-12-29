package Work3.work35;

public class Tester {
    public static void main(String[] args){
        MovableRectangle n1= new MovableRectangle(0,0,1,1,9,7);//проверка на скорости
        MovableRectangle n2= new MovableRectangle(60,70,30,20,10,10);
        n2.moveDown();
        System.out.println(n2);
        n2.moveLeft();
        System.out.println(n2);
        n2.moveRight();
        System.out.println(n2);
        n2.moveUp();
        System.out.println(n2);
    }
}
