package by.mahanko.array.service.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

import by.mahanko.array.service.ArraySearchService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraySearchServiceImpl implements ArraySearchService {
    static Logger logger = LogManager.getLogger(ArraySearchServiceImpl.class.getName());

    public OptionalInt findMaximum(CustomArray array) {
        OptionalInt maximum = Arrays.stream(array.getArray()).max();
        return maximum;
    }

    public OptionalInt findMinimum(CustomArray array) throws CustomException {
        OptionalInt minimum = Arrays.stream(array.getArray()).min();
        return minimum;
    }

    public long findAmountOfPositiveElements(CustomArray array) throws CustomException {
        long amountOfPositiveElements = Arrays
                .stream(array.getArray())
                .filter(x -> x > 0)
                .count();
        logger.info("Amount of positive elements in array - " + amountOfPositiveElements);
        return amountOfPositiveElements;
    }

    public long findAmountOfNegativeElements(CustomArray array) throws CustomException {
        long amountOfNegativeElements = Arrays
                .stream(array.getArray())
                .filter(x -> x < 0)
                .count();
        logger.info("Amount of negative elements in array - " + amountOfNegativeElements);
        return amountOfNegativeElements;
    }
}
