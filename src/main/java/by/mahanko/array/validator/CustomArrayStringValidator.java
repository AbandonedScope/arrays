package by.mahanko.array.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomArrayStringValidator {
    private static final Logger logger = LogManager.getLogger(CustomArrayStringValidator.class.getName());
    private static CustomArrayStringValidator instance;
    private static final String INTS_SEPARATED_BY_SPACE = "\s*((0|-?[1-9]\\d*)\s+)*(0|-?[1-9]\\d*)\s*";

    private CustomArrayStringValidator() {
    }

    public static CustomArrayStringValidator getInstance() {
        if (instance == null) {
            instance = new CustomArrayStringValidator();
        }

        return instance;
    }

    public boolean validateString(String stringOfIntegers) {
        boolean matches;
        if (stringOfIntegers == null) {
            matches = false;
            logger.info("Null string");
        } else if (stringOfIntegers.isBlank()) {
            matches = true;
            logger.info("Blank string");
        } else {
            matches = Pattern.matches(INTS_SEPARATED_BY_SPACE, stringOfIntegers);
            logger.log(Level.INFO, "Validation of string. Result : {0}", matches);
        }

        return matches;
    }
}
