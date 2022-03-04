package test.mahanko.array.parser;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.parser.impl.CustomStringParserImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomStringParserTest {
    private final CustomStringParserImpl parser = new CustomStringParserImpl();
    private final String correctStringToParse = "1 -25 0 36 13 -2";
    private final String incorrectStringToParse = "1 --25 0 36 13 -2";

    @Test
    public void parseStringCorrectStringToParseTest() throws CustomException {
        int[] actual = parser.parseString(correctStringToParse);
        int[] expected = {1, -25, 0, 36, 13, -2};
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void parseStringIncorrectStringToParseTest() throws CustomException{
        parser.parseString(incorrectStringToParse);
    }
}
