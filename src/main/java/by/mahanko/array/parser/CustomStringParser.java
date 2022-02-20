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

    public int[] parseString(String stringToParse) throws CustomException {
        int[] result = null;
        CustomArrayStringValidator validator = new CustomArrayStringValidator();
        if (validator.validateString(stringToParse)) {
            result = Arrays.stream(stringToParse.split("\s+"))
                    .flatMapToInt(num -> IntStream.of(Integer.parseInt(num)))
                    .toArray();
        } else {
            logger.log(Level.ERROR, "Invalid string : " + stringToParse);
            throw new CustomException();
        }

        return result;
    }
}
