package by.mahanko.array.specification.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;
import by.mahanko.array.specification.CustomArraySpecification;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayAverageLessSpecification implements CustomArraySpecification {
    private static Logger logger = LogManager.getLogger(CustomArrayAverageLessSpecification.class);
    private double numberToCompare;

    public CustomArrayAverageLessSpecification (double numberToCompare) {
        this.numberToCompare = numberToCompare;
    }
    @Override
    public boolean specify(CustomArray array) {
        if (array == null || array.length() == 0) {
            return false;
        }

        boolean result = false;
        try {
            double sum = array.getElement(0);
            for (int i = 1; i < array.length(); i++) {
                sum += array.getElement(i);
            }

            result = numberToCompare > sum/array.length();
        } catch (CustomException e) {
            logger.log(Level.WARN, e);
        }

        return result;
    }
}
