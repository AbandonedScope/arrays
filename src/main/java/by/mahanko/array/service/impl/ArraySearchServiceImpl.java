package by.mahanko.array.service.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;

import by.mahanko.array.service.ArraySearchService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraySearchServiceImpl implements ArraySearchService {
    static Logger logger = LogManager.getLogger(ArraySearchServiceImpl.class);

    @Override
    public OptionalInt findMaximum(CustomArray array) {
        OptionalInt maximum = Arrays.stream(array.getArray()).max();
        return maximum;
    }

    @Override
    public OptionalInt findMinimum(CustomArray array) {
        OptionalInt minimum = Arrays.stream(array.getArray()).min();
        return minimum;
    }

    @Override
    public long findAmountOfPositiveElements(CustomArray array) {
        long amountOfPositiveElements = Arrays
                .stream(array.getArray())
                .filter(x -> x > 0)
                .count();
        logger.info("Amount of positive elements in array - " + amountOfPositiveElements);
        return amountOfPositiveElements;
    }

    @Override
    public long findAmountOfNegativeElements(CustomArray array) {
        long amountOfNegativeElements = Arrays
                .stream(array.getArray())
                .filter(x -> x < 0)
                .count();
        logger.info("Amount of negative elements in array - " + amountOfNegativeElements);
        return amountOfNegativeElements;
    }
}
