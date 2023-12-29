package Work20.work202;

public class GenericClass<T,V,K> {
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
}
