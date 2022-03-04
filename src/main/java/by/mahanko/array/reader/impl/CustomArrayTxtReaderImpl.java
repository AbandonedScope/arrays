package by.mahanko.array.reader.impl;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.reader.CustomArrayTxtReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayTxtReaderImpl implements CustomArrayTxtReader {
    static final Logger logger = LogManager.getLogger(CustomArrayTxtReaderImpl.class);

    @Override
    public List<String> readStringsFromFile(String path) throws CustomException {


        List<String> result = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String lineOfFile;
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                result.add(lineOfFile);
            }

        } catch (IOException e) {
            logger.log(Level.ERROR, "File {} is not found or is not readable.", path, e);
            throw new CustomException("File " + path + " is not found or is not readable.", e);
        }

        return result;
    }
}
