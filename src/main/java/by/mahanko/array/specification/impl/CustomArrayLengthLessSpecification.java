package by.mahanko.array.specification.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.specification.CustomArraySpecification;

public class CustomArrayLengthLessSpecification implements CustomArraySpecification {
    private int numberToCompare;

    public CustomArrayLengthLessSpecification(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    @Override
    public boolean specify(CustomArray array) {
        if (array == null) {
            return false;
        }

        return numberToCompare > array.length();
    }
}
