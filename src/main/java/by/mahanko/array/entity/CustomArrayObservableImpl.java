package by.mahanko.array.entity;

import by.mahanko.array.observer.CustomArrayObservable;
import by.mahanko.array.observer.CustomArrayObserver;
import by.mahanko.array.observer.impl.CustomArrayEvent;

import java.util.ArrayList;
import java.util.List;

public abstract class CustomArrayObservableImpl implements CustomArrayObservable {
    private final List<CustomArrayObserver> observers = new ArrayList<>();

    @Override
    public void attach(CustomArrayObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(CustomArrayObserver observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        for (CustomArrayObserver observer : observers) {
            observer.arrayChanged(event);
        }
    }
}
