package test.mahanko.array.validator;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.validator.CustomArrayStringValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayStringValidatorTest {
    private CustomArrayStringValidator validator = new CustomArrayStringValidator();
    private final String positiveElementsString = "1 2 3 4 5 6 7 8 9";
    private final String negativeElementsString = "-1 -2 -3 -4 -5 -6 -7 -8 -9";
    private final String mixedString = "-1 2 16 365 -25 0 26";
    private final String positiveElementStartingWithZeroString = "2 36 48 025 63 95";
    private final String negativeElementStartingWithZeroString = "36 45 89 -69 -026 59 34";
    private final String severalSpacesBetweenElementsString = "125   3654    49 6         654";
    private final String spaceAtTheBeginOfTheString = "   12 -69 84 23 58 96";
    private final String spaceAtTheEndOfTheString = "13 56 -69 87 -25    ";
    private final String spaceAtTheBeginAndEndOfTheString = "    25 -69   25 63 -45   -26    ";
    private final String blankString = "               ";
    private final String emptyString = "";

    @Test
    public void validatePositiveElementsStringTest() {
        boolean actual = validator.validateString(positiveElementsString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateNegativeElementsStringTest() {
        boolean actual = validator.validateString(negativeElementsString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateMixedStringTest() {
        boolean actual = validator.validateString(mixedString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validatePositiveElementStartingWithZeroStringTest() {
        boolean actual = validator.validateString(positiveElementStartingWithZeroString);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateNegativeElementStartingWithZeroStringTest() {
        boolean actual = validator.validateString(negativeElementStartingWithZeroString);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateSeveralSpacesBetweenElementsStringTest() {
        boolean actual = validator.validateString(severalSpacesBetweenElementsString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateSpaceAtTheEndOfTheStringTest() {
        boolean actual = validator.validateString(spaceAtTheEndOfTheString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateSpaceAtTheBeginOfTheStringTest() {
        boolean actual = validator.validateString(spaceAtTheBeginOfTheString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateSpaceAtTheBeginAndEndOfTheStringTest() {
        boolean actual = validator.validateString(spaceAtTheBeginAndEndOfTheString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateBlankStringTest() {
        boolean actual = validator.validateString(blankString);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateEmptyStringTest() {
        boolean actual = validator.validateString(emptyString);
        Assert.assertFalse(actual);
    }
}
