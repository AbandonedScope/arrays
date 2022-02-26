package by.mahanko.array.main;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.parser.impl.CustomStringParserImpl;
import by.mahanko.array.service.impl.ArrayCalculateServiceImpl;
import by.mahanko.array.service.impl.ArrayManipulationServiceImpl;
import by.mahanko.array.service.impl.ArraySearchServiceImpl;
import by.mahanko.array.service.impl.ArraySortServiceImpl;


public class App {
    public static void main(String[] args) {
        try {
            CustomStringParserImpl parser = new CustomStringParserImpl();
            int[] a = parser.parseString("");
            System.out.println(a.length);
        }
        catch (Exception exception) {
            System.out.println("Exception");
        }

    }
}
