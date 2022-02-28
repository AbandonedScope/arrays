package by.mahanko.array.repository;

import by.mahanko.array.entity.CustomArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomArraysRepository {
    private List<CustomArray> arrays;
    private static CustomArraysRepository instance;
    private CustomArraysRepository() {
        arrays = new ArrayList<CustomArray>();
    }

    public static CustomArraysRepository getInstance() {
        if (instance == null) {
            instance = new CustomArraysRepository();
        }

        return instance;
    }

    public boolean add(CustomArray array) {
        return arrays.add(array);
    }

    public boolean remove(Object o) {
        return arrays.remove(o);
    }

    public boolean addAll(Collection<? extends CustomArray> c) {
        return arrays.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return arrays.removeAll(c);
    }
}
