package by.mahanko.array.repository;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.specification.CustomArraySpecification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CustomArraysRepository {
    private static CustomArraysRepository instance;
    private final List<CustomArray> arrays;

    private CustomArraysRepository() {
        arrays = new ArrayList<>();
    }

    public static CustomArraysRepository getInstance() {
        if (instance == null) {
            instance = new CustomArraysRepository();
        }

        return instance;
    }

    public void set(int index, CustomArray array) {
        arrays.set(index, array);
    }

    public CustomArray get(int index) {
        return arrays.get(index);
    }

    public boolean add(CustomArray array) {
        return arrays.add(array);
    }

    public boolean remove(CustomArray array) {
        return arrays.remove(array);
    }

    public boolean addAll(Collection<? extends CustomArray> c) {
        return arrays.addAll(c);
    }

    public boolean removeAll(Collection<? extends CustomArray> c) {
        return arrays.removeAll(c);
    }

    public List<CustomArray> query(CustomArraySpecification specification) {
        return this.arrays.stream().filter(specification::specify).toList();
    }

    public void sort(Comparator<CustomArray> comparator) {
        arrays.sort(comparator);
    }
}
