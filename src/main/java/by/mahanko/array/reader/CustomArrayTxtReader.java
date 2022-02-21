package by.mahanko.array.reader;

import by.mahanko.array.exception.CustomFileDoesntExistException;

import java.util.List;

public interface CustomArrayTxtReader {
    List<String> readStringsFromFile(String path) throws CustomFileDoesntExistException;
}
