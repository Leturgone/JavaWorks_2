package Work9.work678;

public class Tester {
    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder();

        Observer observer = new StringBuilderObserver();
        stringBuilder.registerObserver(observer);

        stringBuilder.append("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("world!");

        stringBuilder.delete(0, 5);

        stringBuilder.unregisterObserver(observer);
    }
}
