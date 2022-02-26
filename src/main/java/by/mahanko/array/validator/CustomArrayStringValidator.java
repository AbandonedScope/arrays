package by.mahanko.array.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomArrayStringValidator { // FIXME: 23.02.2022 Singleton pattern
    private static Logger logger = LogManager.getLogger(CustomArrayStringValidator.class.getName());
    private static final String INTS_SEPARATED_BY_SPACE = "\s*((0|-?[1-9]\\d*)\s+)*(0|-?[1-9]\\d*)\s*";

    public boolean validateString(String stringOfIntegers) {
        boolean matches;
        if (stringOfIntegers == null) {
            matches = false;
            logger.info("Null string");
        } else if(stringOfIntegers.isBlank()) {
            matches = true;
            logger.info("Blank string");
        } else {
            matches = Pattern.matches(INTS_SEPARATED_BY_SPACE, stringOfIntegers);
            logger.info("Validation of string. Result : " + matches);
        }

        return matches;
    }
}
