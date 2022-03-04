package by.mahanko.array.main;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.reader.impl.CustomArrayTxtReaderImpl;

public class App {
    public static void main(String[] args) {
        CustomArrayTxtReaderImpl reader = new CustomArrayTxtReaderImpl();
        try {
            reader.readStringsFromFile("dgdfgfg");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
