package test.mahanko.array.parser;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.parser.impl.CustomStringParserImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomStringParserTest {
    private final CustomStringParserImpl parser = new CustomStringParserImpl();

    @Test
    public void parseStringCorrectStringToParseTest() throws CustomException {
        String correctStringToParse = "1 -25 0 36 13 -2";
        int[] actual = parser.parseString(correctStringToParse);
        int[] expected = {1, -25, 0, 36, 13, -2};
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void parseStringIncorrectStringToParseTest() throws CustomException{
        String incorrectStringToParse = "1 --25 0 36 13 -2";
        parser.parseString(incorrectStringToParse);
    }
}
