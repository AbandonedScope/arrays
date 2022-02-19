package by.mahanko.array.service;

import by.mahanko.array.entity.ArrayException;
import by.mahanko.array.entity.CustomArray;

public class ArrayCalculateService {
    public int countElementsSum(CustomArray array) throws ArrayException {
        if (array.length() == 0) {
            throw new ArrayException();
        }
        int sum = 0;
        for (int element : array.getArray()) {
            sum += element;
        }

        return sum;
    }

    public double countAverage(CustomArray array) throws ArrayException {
        double average = countElementsSum(array) / (double) array.length();
        return average;
    }
}
