package by.mahanko.array.service;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

public class ArraySearchService {
    public int findMaximum(CustomArray array) throws CustomException {
        int maximum = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            if(maximum < array.getElement(i)) {
                maximum = array.getElement(i);
            }
        }

        return maximum;
    }

    public int findMinimum(CustomArray array) throws CustomException {
        int minimum = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            if(minimum > array.getElement(i)) {
                minimum = array.getElement(i);
            }
        }

        return minimum;
    }

    public int findAmountOfPositiveElements(CustomArray array) throws CustomException {
        int amountOfPositiveElements = 0;
        for (int element : array.getArray()) {
            if(element > 0) {
                amountOfPositiveElements++;
            }
        }

        return  amountOfPositiveElements;
    }

    public int findAmountOfNegativeElements(CustomArray array) throws CustomException {
        int amountOfNegativeElements = 0;
        for (int element : array.getArray()) {
            if(element < 0) {
                amountOfNegativeElements++;
            }
        }

        return  amountOfNegativeElements;
    }
}
