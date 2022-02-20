package by.mahanko.array.validator;

import by.mahanko.array.exception.CustomException;

import java.util.regex.Pattern;

public class CustomArrayStringValidator {
    private final String regularExpression = "((0|-?[1-9][0-9]*)\s+)*(0|-?[1-9][0-9]*)";

    public boolean validateString(String stringToValidate) throws CustomException {
        if(stringToValidate == null || stringToValidate.length() == 0) {
            throw new CustomException();
        }
        boolean answer = Pattern.matches(regularExpression, stringToValidate);
        return answer;
    }
}
