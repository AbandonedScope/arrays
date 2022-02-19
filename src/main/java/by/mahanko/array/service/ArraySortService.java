package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;

public interface ArraySortService {
    void mergeSort(CustomArray array) throws CustomException;

    void mergeSort(CustomArray array, int leftBound, int rightBound) throws CustomException;

    void insertionSort(CustomArray array) throws CustomException;

    void insertionSort(CustomArray array, int leftBound, int rightBound) throws CustomException;

    void bubbleSort(CustomArray array) throws CustomException;

    void bubbleSort(CustomArray array, int leftBound, int rightBound) throws CustomException;
}
