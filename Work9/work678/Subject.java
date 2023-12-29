package Work9.work678;

public interface Subject {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
