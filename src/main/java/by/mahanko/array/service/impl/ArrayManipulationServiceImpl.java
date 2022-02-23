package by.mahanko.array.service.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.ArrayManipulationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class ArrayManipulationServiceImpl implements ArrayManipulationService {
    static Logger logger = LogManager.getLogger(ArrayManipulationServiceImpl.class.getName());

    @Override
    public void replaceAllNegativeElements(CustomArray array, int valueToReplaceWith) throws CustomException {
        if (array.length() == 0) {
            logger.log(Level.ERROR, "Array length equals 0");
            throw new CustomException("Array length equals 0");
        }

        int[] arrayWithReplacedNegativeElements = Arrays
                .stream(array.getArray())
                .map(x -> x < 0 ? valueToReplaceWith : x)
                .toArray();
        array.setArray(arrayWithReplacedNegativeElements);
        logger.info("Array negative elements were replaced with - " + valueToReplaceWith);
    }

    @Override
    public void replaceAllElementInRegion(CustomArray array, int lowerBound, int uppedBound, int valueToReplaceWith) throws CustomException {
        if (array.length() == 0 || lowerBound > uppedBound) {
            logger.log(Level.ERROR, "Array length equals 0 or lower bound more than upper bound");
            throw new CustomException("Array length equals 0 or lower bound more than upper bound");
        }

        int[] arrayWithReplacedInRangeElements = Arrays
                .stream(array.getArray())
                .map(x -> (x >= lowerBound && x <= uppedBound) ? valueToReplaceWith : x)
                .toArray();
        array.setArray(arrayWithReplacedInRangeElements);
        logger.info("Array elements in region from " + lowerBound + " to " + uppedBound + " were replaced with - " + valueToReplaceWith);
    }
}
