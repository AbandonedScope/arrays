package by.mahanko.array.service.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.ArrayCalculateService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    static final Logger logger = LogManager.getLogger(ArrayCalculateServiceImpl.class);

    @Override
    public int countElementsSum(CustomArray array) {
        int sum = Arrays.stream(array.getArray()).sum();
        logger.log(Level.INFO, "Elements sum - {}", sum);
        return sum;
    }

    @Override
    public OptionalDouble countAverage(CustomArray array) {
        OptionalDouble average = Arrays.stream(array.getArray()).average();
        logger.log(Level.INFO, "The average of array is - {}", average);
        return average;
    }
}
