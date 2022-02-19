package by.mahanko.array.service;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ArraySearchService {
    static Logger logger = LogManager.getLogger(ArraySearchService.class.getName());

    public int findMaximum(CustomArray array) throws CustomException {
        int maximum = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            if(maximum < array.getElement(i)) {
                maximum = array.getElement(i);
            }
        }

        logger.info("Array maximum - " + maximum);

        return maximum;
    }

    public int findMinimum(CustomArray array) throws CustomException {
        int minimum = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            if(minimum > array.getElement(i)) {
                minimum = array.getElement(i);
            }
        }

        logger.info("Array minimum - " + minimum);

        return minimum;
    }

    public int findAmountOfPositiveElements(CustomArray array) throws CustomException {
        int amountOfPositiveElements = 0;
        for (int element : array.getArray()) {
            if(element > 0) {
                amountOfPositiveElements++;
            }
        }

        logger.info("Amount of positive elements in array - " + amountOfPositiveElements);

        return  amountOfPositiveElements;
    }

    public int findAmountOfNegativeElements(CustomArray array) throws CustomException {
        int amountOfNegativeElements = 0;
        for (int element : array.getArray()) {
            if(element < 0) {
                amountOfNegativeElements++;
            }
        }

        logger.info("Amount of negative elements in array - " + amountOfNegativeElements);

        return  amountOfNegativeElements;
    }
}
