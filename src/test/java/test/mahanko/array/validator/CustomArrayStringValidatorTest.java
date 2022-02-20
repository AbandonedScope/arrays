package test.mahanko.array.validator;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.validator.CustomArrayStringValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayStringValidatorTest {
    private CustomArrayStringValidator validator = new CustomArrayStringValidator();
    private final String correctString = "-1 2 16 365 -25 0 26";
    private final String emptyString = "";

    @Test
    public void validateCorrectStringTest()  throws CustomException {
        boolean actual = validator.validateString(correctString);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void validateEmptyStringTest()  throws CustomException {
        validator.validateString(emptyString);
    }
}
