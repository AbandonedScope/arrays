package test.mahanko.array.reader;

import by.mahanko.array.exception.CustomFileDoesntExistException;
import by.mahanko.array.reader.CustomArrayTxtReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomArrayTxtReaderTest {
    private CustomArrayTxtReader reader = new CustomArrayTxtReader();
    private final String pathToNonexistentFile = "non-existent-file.txt";
    private final String pathToExistFile = "D:/arrays/src/test/resources/customarraytxtreadertestfile.txt";

    @Test(expectedExceptions = CustomFileDoesntExistException.class)
    public void readStringsFromFileNonexistentFileTest() throws CustomFileDoesntExistException {
        reader.readStringsFromFile(pathToNonexistentFile);
    }

    @Test
    public void readStringsFromFileExistentFileTest() throws CustomFileDoesntExistException {
        List<String> actual = reader.readStringsFromFile(pathToExistFile);
        List<String> expected = Arrays.asList("1 2 3 4 5 6 7 8 9", "", "-2 3 -12  -56 6");
        Assert.assertEquals(actual, expected);
    }
}
