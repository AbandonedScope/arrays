package by.mahanko.array.observer;

import by.mahanko.array.observer.impl.CustomArrayEvent;

public interface CustomArrayObserver {
    void arrayChanged(CustomArrayEvent event);
}
