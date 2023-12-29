package Work20.work203;

import java.io.Serializable;
class Animal implements Serializable {

}
public class GenericClass<T extends Comparable, V extends Animal & Serializable , K>  {
    private T a;
    private V b;
    private K c;

    public GenericClass(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public K getC() {
        return c;
    }
    public void printClassNames() {
        System.out.println("T class name: " + a.getClass().getName());
        System.out.println("V class name: " + b.getClass().getName());
        System.out.println("K class name: " + c.getClass().getName());
    }
    public static void main(String[] args) {
        GenericClass<Integer, Animal, String> myObject = new GenericClass<>(42, new Animal(), "Example");
        myObject.printClassNames();
    }
}

