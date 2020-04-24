package duck_sim;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
