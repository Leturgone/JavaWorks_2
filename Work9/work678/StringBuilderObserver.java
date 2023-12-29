package Work9.work678;

public class StringBuilderObserver implements Observer{
    @Override
    public void update(MyStringBuilder stringBuilder) {
        System.out.println("Состояние объекта StringBuilderWithObserver изменилось");
        System.out.println("Новое состояние: " + stringBuilder.toString());
    }
}
