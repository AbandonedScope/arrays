package by.mahanko.array.parser.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.parser.CustomStringParser;
import by.mahanko.array.validator.CustomArrayStringValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomStringParserImpl implements CustomStringParser {
    private static Logger logger = LogManager.getLogger(CustomStringParserImpl.class.getName());
    private static final String SPLITTER = "\s+";

    @Override
    public int[] parseString(String stringToParse) throws CustomException {
        int[] result = null;
        CustomArrayStringValidator validator = new CustomArrayStringValidator();
        if (validator.validateString(stringToParse)) {
            result = Arrays.stream(stringToParse.split(SPLITTER))
                    .flatMapToInt(num -> IntStream.of(Integer.parseInt(num)))
                    .toArray();
        } else {
            logger.log(Level.ERROR, "Invalid string : " + stringToParse);
            throw new CustomException("Invalid string : " + stringToParse);
        }

        return result;
    }

    @Override
    public int[] parseValidString(String stringToParse) throws CustomException {
        int[] result = null;
        try {
            result = Arrays.stream(stringToParse.split(SPLITTER))// FIXME: 23.02.2022 in constant
                    .flatMapToInt(num -> IntStream.of(Integer.parseInt(num)))
                    .toArray();
        } catch (Exception exception) {
            logger.log(Level.ERROR, "Invalid string : " + stringToParse);
            throw new CustomException(exception.getMessage());
        }

        return result;
    }
}
