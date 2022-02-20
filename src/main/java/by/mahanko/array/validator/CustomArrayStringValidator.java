package by.mahanko.array.validator;

import java.util.regex.Pattern;

public class CustomArrayStringValidator {
    private final String regularExpression = "\b(-?[1-9][0-9]*\s+)*-?[1-9][0-9]*\b";

    public boolean validateString(String stringToValidate) {
        boolean answer = Pattern.matches(regularExpression, stringToValidate);
        return answer;
    }
}
