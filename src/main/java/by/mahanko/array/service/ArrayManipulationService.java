package by.mahanko.array.service;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

public class ArrayManipulationService {
    public void replaceAllNegativeElements(CustomArray array, int valueToReplaceWith) throws CustomException {
        if (array.length() == 0) {
            throw  new CustomException();
        }

        int length = array.length();
        for (int i = 0; i < length; i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, valueToReplaceWith);
            }
        }
    }

    public void replaceAllElementInRegion(CustomArray array, int lowerBound, int uppedBound, int valueToReplaceWith) throws CustomException {
        if (array.length() == 0) {
            throw  new CustomException();
        }

        int length = array.length();
        for (int i = 0; i < length; i++) {
            if (array.getElement(i) >= lowerBound && array.getElement(i) <= uppedBound) {
                array.setElement(i, valueToReplaceWith);
            }
        }
    }
}
