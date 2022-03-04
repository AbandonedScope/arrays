package by.mahanko.array.comparator;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class CustomArrayFirstElementComparator implements Comparator<CustomArray> {
    private static final Logger logger = LogManager.getLogger(CustomArrayFirstElementComparator.class);

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray) {
        int answer = 0;
        try {
            if (firstArray.length() == 0 && secondArray.length() != 0) {
                answer = -1;
            } else if (secondArray.length() == 0 && firstArray.length() != 0) {
                answer = 1;
            } else if (secondArray.length() == 0 && firstArray.length() == 0) {
                answer = 0;
            } else {
                if (firstArray.getElement(0) > secondArray.getElement(0)) {
                    answer = 1;
                } else if (firstArray.getElement(0) < secondArray.getElement(0)) {
                    answer = -1;
                }
            }
        } catch (CustomException e) {
            logger.log(Level.WARN, e);
        }

        return answer;
    }
}
