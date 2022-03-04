package by.mahanko.array.service.impl;

import by.mahanko.array.entity.CustomArray;

import by.mahanko.array.service.ArraySearchService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraySearchServiceImpl implements ArraySearchService {
    static final Logger logger = LogManager.getLogger(ArraySearchServiceImpl.class);

    @Override
    public OptionalInt findMaximum(CustomArray array) {
        return Arrays.stream(array.getArray()).max();
    }

    @Override
    public OptionalInt findMinimum(CustomArray array) {
        return Arrays.stream(array.getArray()).min();
    }

    @Override
    public long findAmountOfPositiveElements(CustomArray array) {
        long amountOfPositiveElements = Arrays
                .stream(array.getArray())
                .filter(x -> x > 0)
                .count();
        logger.log(Level.INFO, "Amount of positive elements in array - {}", amountOfPositiveElements);
        return amountOfPositiveElements;
    }

    @Override
    public long findAmountOfNegativeElements(CustomArray array) {
        long amountOfNegativeElements = Arrays
                .stream(array.getArray())
                .filter(x -> x < 0)
                .count();
        logger.log(Level.INFO, "Amount of negative elements in array - {}", amountOfNegativeElements);
        return amountOfNegativeElements;
    }
}
