package by.mahanko.array.observer;

public interface CustomArrayObservable {
    void attach(CustomArrayObserver observer);
    void detach(CustomArrayObserver observer);
    void notifyObservers();
}
