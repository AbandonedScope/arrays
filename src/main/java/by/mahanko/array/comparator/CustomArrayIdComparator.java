package by.mahanko.array.comparator;

import by.mahanko.array.entity.CustomArray;

import java.util.Comparator;

public class CustomArrayIdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray) {
        return firstArray.getId().compareTo(secondArray.getId());
    }
}
