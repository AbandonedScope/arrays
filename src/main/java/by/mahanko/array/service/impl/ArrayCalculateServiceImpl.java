package by.mahanko.array.service.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    static Logger logger = LogManager.getLogger(ArrayCalculateServiceImpl.class.getName());

    public int countElementsSum(CustomArray array) throws CustomException {
        if (array.length() == 0) {
            throw new CustomException();
        }
        int sum = 0;
        for (int element : array.getArray()) {
            sum += element;
        }
        logger.info("Elements sum - " + sum);
        return sum;
    }

    public double countAverage(CustomArray array) throws CustomException {
        double average = countElementsSum(array) / (double) array.length();
        logger.info("Array's average - " + average);
        return average;
    }
}
