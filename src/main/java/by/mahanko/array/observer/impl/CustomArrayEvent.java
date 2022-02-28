package by.mahanko.array.observer.impl;

import by.mahanko.array.entity.CustomArray;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {
    public CustomArrayEvent(Object source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray)super.getSource();
    }
}
