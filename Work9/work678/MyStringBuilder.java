package Work9.work678;
import java.util.ArrayList;
import java.util.List;
public class MyStringBuilder implements Subject  {
    private StringBuilder ob;
    private List<Observer> observers;
    public MyStringBuilder() {
        ob = new StringBuilder();
        observers = new ArrayList<>();
    }
    public void append(String str) {
        ob.append(str);
        notifyObservers();
    }

    public void delete(int start, int end) {
        ob.delete(start, end);
        notifyObservers();
    }

    public String toString() {
        return ob.toString();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
