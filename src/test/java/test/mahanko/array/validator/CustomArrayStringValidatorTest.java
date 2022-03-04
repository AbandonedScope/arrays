package test.mahanko.array.validator;

import by.mahanko.array.validator.CustomArrayStringValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayStringValidatorTest {
    private final CustomArrayStringValidator validator = CustomArrayStringValidator.getInstance();

    @Test
    public void validatePositiveElementsStringTest() {
        String positiveElementsString = "1 2 3 4 5 6 7 8 9";
        boolean actual = validator.validateString(positiveElementsString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateNegativeElementsStringTest() {
        String negativeElementsString = "-1 -2 -3 -4 -5 -6 -7 -8 -9";
        boolean actual = validator.validateString(negativeElementsString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateMixedStringTest() {
        String mixedString = "-1 2 16 365 -25 0 26";
        boolean actual = validator.validateString(mixedString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validatePositiveElementStartingWithZeroStringTest() {
        String positiveElementStartingWithZeroString = "2 36 48 025 63 95";
        boolean actual = validator.validateString(positiveElementStartingWithZeroString);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateNegativeElementStartingWithZeroStringTest() {
        String negativeElementStartingWithZeroString = "36 45 89 -69 -026 59 34";
        boolean actual = validator.validateString(negativeElementStartingWithZeroString);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateSeveralSpacesBetweenElementsStringTest() {
        String severalSpacesBetweenElementsString = "125   3654    49 6         654";
        boolean actual = validator.validateString(severalSpacesBetweenElementsString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateSpaceAtTheEndOfTheStringTest() {
        String spaceAtTheEndOfTheString = "13 56 -69 87 -25    ";
        boolean actual = validator.validateString(spaceAtTheEndOfTheString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateSpaceAtTheBeginOfTheStringTest() {
        String spaceAtTheBeginOfTheString = "   12 -69 84 23 58 96";
        boolean actual = validator.validateString(spaceAtTheBeginOfTheString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateSpaceAtTheBeginAndEndOfTheStringTest() {
        String spaceAtTheBeginAndEndOfTheString = "    25 -69   25 63 -45   -26    ";
        boolean actual = validator.validateString(spaceAtTheBeginAndEndOfTheString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateBlankStringTest() {
        String blankString = "               ";
        boolean actual = validator.validateString(blankString);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateEmptyStringTest() {
        String emptyString = "";
        boolean actual = validator.validateString(emptyString);
        Assert.assertTrue(actual);
    }
}
