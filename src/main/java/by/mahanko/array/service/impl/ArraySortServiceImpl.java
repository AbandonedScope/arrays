package by.mahanko.array.service.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

import by.mahanko.array.service.ArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ArraySortServiceImpl implements ArraySortService {
    static Logger logger = LogManager.getLogger(ArraySortServiceImpl.class.getName());

    @Override
    public void mergeSort(CustomArray array) throws CustomException {
        mergeSort(array, 0, array.length() - 1);
    }

    @Override
    public void mergeSort(CustomArray array, int leftBound, int rightBound) throws CustomException {
        if (array.length() == 0 || leftBound > rightBound) {
            throw new CustomException();
        }

        int middle = (rightBound - leftBound) / 2 + leftBound;
        if (middle > leftBound) {
            mergeSort(array, leftBound, middle);
        }

        if (middle + 1 < rightBound) {
            mergeSort(array, middle + 1, rightBound);
        }

        merge(array, leftBound, middle, rightBound);
    }

    @Override
    public void insertionSort(CustomArray array) throws CustomException {
        insertionSort(array, 0, array.length() - 1);
    }

    @Override
    public void insertionSort(CustomArray array, int leftBound, int rightBound) throws CustomException {
        if (rightBound < leftBound || array.length() == 0) {
            logger.log(Level.ERROR, "Array length equals 0 or left bound more than right bound");
            throw new CustomException();
        }

        for (int i = leftBound + 1; i <= rightBound; i++) {
            if (i == 0) {
                continue;
            }

            if (array.getElement(i) < array.getElement(i - 1)) {
                int buffer = array.getElement(i);
                array.setElement(i, array.getElement(i - 1));
                array.setElement(i - 1, buffer);
                i -= 2;
            }
        }

        logger.info("Array was sorted by using Insertion Sort");
    }

    @Override
    public void bubbleSort(CustomArray array) throws CustomException {
        bubbleSort(array, 0, array.length() - 1);
    }

    @Override
    public void bubbleSort(CustomArray array, int leftBound, int rightBound) throws CustomException {
        if (array.length() == 0 || rightBound < leftBound) {
            logger.log(Level.ERROR, "Array length equals 0 or left bound more than right bound");
            throw new CustomException();
        }

        for (int i = leftBound; i <= rightBound; i++) {
            for (int j = 0; j < rightBound - i; j++) {
                if (array.getElement(j) > array.getElement(j + 1)) {
                    int buffer = array.getElement(j);
                    array.setElement(j, array.getElement(j + 1));
                    array.setElement(j + 1, buffer);
                }
            }
        }

        logger.info("Array was sorted by using Bubble Sort");
    }

    private void merge(CustomArray array, int leftBound, int middle, int rightBound) throws CustomException {
        if (rightBound < leftBound) {
            logger.log(Level.ERROR, "Lower bound more than upper bound");
            throw new CustomException();
        }

        int leftArrayPartLength = middle - leftBound + 1;
        int rightArrayPartLength = rightBound - middle;
        int[] leftArrayPart = new int[leftArrayPartLength];
        int[] rightArrayPart = new int[rightArrayPartLength];
        for (int i = 0; i < leftArrayPartLength; i++) {
            leftArrayPart[i] = array.getElement(leftBound + i);
        }

        for (int i = 0; i < rightArrayPartLength; i++) {
            rightArrayPart[i] = array.getElement(middle + 1 + i);
        }

        int i = 0, j = 0, k = leftBound;
        while (i < leftArrayPartLength && j < rightArrayPartLength) {
            if (leftArrayPart[i] <= rightArrayPart[j]) {
                array.setElement(k, leftArrayPart[i]);
                i++;
            } else {
                array.setElement(k, rightArrayPart[j]);
                j++;
            }

            k++;
        }

        while (i < leftArrayPartLength) {
            array.setElement(k, leftArrayPart[i]);
            i++;
            k++;
        }

        while (j < rightArrayPartLength) {
            array.setElement(k, rightArrayPart[j]);
            j++;
            k++;
        }
    }
}
