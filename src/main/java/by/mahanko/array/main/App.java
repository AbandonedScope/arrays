package by.mahanko.array.main;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.entity.CustomArrayData;
import by.mahanko.array.entity.CustomArrayWarehouse;
import by.mahanko.array.parser.impl.CustomStringParserImpl;
import by.mahanko.array.service.impl.ArrayCalculateServiceImpl;
import by.mahanko.array.service.impl.ArrayManipulationServiceImpl;
import by.mahanko.array.service.impl.ArraySearchServiceImpl;
import by.mahanko.array.service.impl.ArraySortServiceImpl;


public class App {
    public static void main(String[] args) {
        try {
            CustomArray array = new CustomArray(1, 2, 3);
        }
        catch (Exception exception) {
            System.out.println("Exception");
        }

    }
}
