package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;

public class ArrayCalculateService {
    public int countElementsSum(CustomArray array) {
        int sum = 0;
        for (int element : array.getArray()) {
            sum += element;
        }

        return sum;
    }

    public double countAverage(CustomArray array) {
        double average = countElementsSum(array) / (double)array.length();
        return average;
    }
}
