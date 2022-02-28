package by.mahanko.array.reader.impl;

import by.mahanko.array.exception.CustomException;
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
    static Logger logger = LogManager.getLogger(CustomArrayTxtReaderImpl.class);

    @Override
    public List<String> readStringsFromFile(String path) throws CustomException {
        if (!Files.exists(Paths.get(path))) {
            logger.log(Level.ERROR, "File {} is not found.", path);
            throw new CustomException("File " + path + " is not found.");
        }

        if (!Files.isReadable(Paths.get(path))) {
            logger.log(Level.ERROR, "File {} is not readable.", path);
            throw new CustomException("File " + path + " is not readable.");
        }

        List<String> result = new ArrayList<String>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String lineOfFile;
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                result.add(lineOfFile);
            }

        } catch (IOException e) {
            logger.log(Level.ERROR, "File " + path + " is not found or is not readable.", e);
            throw new CustomException("File " + path + " is not found or is not readable.", e);
        }

        return result;
    }
}
