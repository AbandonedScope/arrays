package by.mahanko.array.parser;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.validator.CustomArrayStringValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomStringParser {
    private static Logger logger = LogManager.getLogger(CustomStringParser.class.getName());

    public int[] parseString(String stringToParse) {
        int[] result = null;
        try {
            CustomArrayStringValidator validator = new CustomArrayStringValidator();
            if (validator.validateString(stringToParse)) {
                result = Arrays.stream(stringToParse.split("\s+"))
                        .flatMapToInt(num -> IntStream.of(Integer.parseInt(num)))
                        .toArray();
            }
        } catch (CustomException exception) {
            logger.log(Level.ERROR, "Empty or null string");
        }

        return  result;
    }
}
