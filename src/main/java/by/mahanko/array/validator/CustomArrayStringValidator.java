package by.mahanko.array.validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomArrayStringValidator { // FIXME: 23.02.2022 Singleton pattern
    private static Logger logger = LogManager.getLogger(CustomArrayStringValidator.class.getName());
    private static final String INTS_SEPARATED_BY_SPACE = "\s*((0|-?[1-9]\\d*)\s+)*(0|-?[1-9]\\d*)\s*"; // FIXME: 23.02.2022 \d ect.

    public boolean validateString(String stringOfIntegers) {
        if(stringOfIntegers == null || stringOfIntegers.isEmpty()) {
            return false;
        }

        return Pattern.matches(INTS_SEPARATED_BY_SPACE, stringOfIntegers);
    }
}
