package by.mahanko.array.reader;

import by.mahanko.array.exception.CustomFileDoesntExistException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayTxtReader {
    static Logger logger = LogManager.getLogger(CustomArrayTxtReader.class.getName());

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
            logger.log(Level.ERROR, "File {} is not found.", path);
            e.printStackTrace();
        }
        return result;
    }
}
