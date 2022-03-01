package by.mahanko.array.specification.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;
import by.mahanko.array.specification.CustomArraySpecification;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySumLessSpecification implements CustomArraySpecification {
    private Logger logger = LogManager.getLogger(CustomArraySumLessSpecification.class);
    private int numberToCompare;

    public CustomArraySumLessSpecification(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    @Override
    public boolean specify(CustomArray array) {
        if (array == null || array.length() == 0) {
            return false;
        }

        boolean result = false;
        try {
            int sum = array.getElement(0);
            for (int i = 1; i < array.length(); i++) {
                sum += array.getElement(i);
            }

            result = numberToCompare > sum;
        } catch (CustomException e) {
            logger.log(Level.WARN, e);
        }

        return result;
    }
}
