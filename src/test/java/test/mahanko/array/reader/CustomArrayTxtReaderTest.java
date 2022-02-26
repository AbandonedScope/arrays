package test.mahanko.array.reader;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.reader.impl.CustomArrayTxtReaderImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayTxtReaderTest {
    private CustomArrayTxtReaderImpl reader = new CustomArrayTxtReaderImpl();
    private final String pathToNonexistentFile = "non-existent-file.txt";
    private final String pathToExistFile = "src/test/resources/customarraytxtreadertestfile.txt";
    private final String pathToEmptyFile = "src/test/resources/emptifiletest.txt";
    private final String pathToFileWithOneBlankLine = "src/test/resources/oneblanklinetestfile.txt";

    @Test(expectedExceptions = CustomException.class)
    public void readStringsFromFileNonexistentFileTest() throws CustomException {
        reader.readStringsFromFile(pathToNonexistentFile);
    }

    @Test
    public void readStringsFromFileExistentFileTest() throws CustomException {
        List<String> actual = reader.readStringsFromFile(pathToExistFile);
        List<String> expected = Arrays.asList("1 2 3 4 5 6 7 8 9", "", "-2 3 -12  -56 6");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void readStringsFromEmptyFileTest() throws CustomException {
        List<String> actual = reader.readStringsFromFile(pathToEmptyFile);
        List<String> expected = Arrays.asList();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void readStringsFromFileWithOneBlankLineTest() throws CustomException {
        List<String> actual = reader.readStringsFromFile(pathToFileWithOneBlankLine);
        List<String> expected = Arrays.asList("");
        Assert.assertEquals(actual, expected);
    }
}
