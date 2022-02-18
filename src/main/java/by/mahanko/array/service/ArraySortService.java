package by.mahanko.array.service;

import by.mahanko.array.entity.ArrayException;
import by.mahanko.array.entity.CustomArray;

public class ArraySortService {
    public void mergeSort(CustomArray array) throws ArrayException {
        mergeSort(array, 0, array.length() - 1);
    }

    public void mergeSort(CustomArray array, int left, int right) throws ArrayException {
        if (left < right) {
            int middle = (right - left) / 2 + left;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(CustomArray array, int leftBound, int middle, int rightBound) throws ArrayException {
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
