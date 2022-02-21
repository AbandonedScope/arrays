package by.mahanko.array.reader.impl;

import by.mahanko.array.exception.CustomFileDoesntExistException;
import by.mahanko.array.reader.CustomArrayTxtReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayTxtReaderImpl implements CustomArrayTxtReader {
    static Logger logger = LogManager.getLogger(CustomArrayTxtReaderImpl.class.getName());

    public List<String> readStringsFromFile(String path) throws CustomFileDoesntExistException {
        if (!Files.exists(Paths.get(path))) {
            logger.log(Level.ERROR, "File {} is not found.", path);
            throw new CustomFileDoesntExistException();
        }

        List<String> result = null;
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            result = new ArrayList<String>();
            String lineOfFile;
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                result.add(lineOfFile);
            }

        } catch (IOException e) {
            logger.log(Level.WARN, "File {} is not found.", path);
        }
        return result;
    }
}
