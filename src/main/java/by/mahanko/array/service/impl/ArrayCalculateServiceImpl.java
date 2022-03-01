package by.mahanko.array.service.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.ArrayCalculateService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    static Logger logger = LogManager.getLogger(ArrayCalculateServiceImpl.class);

    @Override
    public int countElementsSum(CustomArray array) {
/*        if (array == null || array.length() == 0) {
            logger.log(Level.ERROR, "Array equals null or array length equals 0");
            throw new CustomException("Array equals null or array length equals 0");
        }*/
        int sum = Arrays.stream(array.getArray())
                .sum();
        logger.info("Elements sum - " + sum);
        return sum;
    }

    @Override
    public OptionalDouble countAverage(CustomArray array) {
        OptionalDouble average = Arrays.stream(array.getArray()).average();
        logger.info("Array's average - " + average);
        return average;
    }
}
