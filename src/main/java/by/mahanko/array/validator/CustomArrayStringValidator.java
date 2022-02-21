package by.mahanko.array.validator;

import by.mahanko.array.exception.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomArrayStringValidator {
    private static Logger logger = LogManager.getLogger(CustomArrayStringValidator.class.getName());
    private final String regularExpression = "((0|-?[1-9][0-9]*)\s+)*(0|-?[1-9][0-9]*)";

    public boolean validateString(String stringToValidate) throws CustomException {
        if(stringToValidate == null || stringToValidate.isEmpty()) {
            logger.log(Level.ERROR, "Empty or null string");
            throw new CustomException();
        }
        boolean answer = Pattern.matches(regularExpression, stringToValidate);
        return answer;
    }
}
