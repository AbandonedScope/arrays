package by.mahanko.array.service;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

public class ArrayCalculateService {
    public int countElementsSum(CustomArray array) throws CustomException {
        if (array.length() == 0) {
            throw new CustomException();
        }
        int sum = 0;
        for (int element : array.getArray()) {
            sum += element;
        }

        return sum;
    }

    public double countAverage(CustomArray array) throws CustomException {
        double average = countElementsSum(array) / (double) array.length();
        return average;
    }
}
