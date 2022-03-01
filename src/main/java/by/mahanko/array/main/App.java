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
            CustomArrayWarehouse warehouse = CustomArrayWarehouse.getInstance();
            array.attach(warehouse);
            warehouse.put(array.getId(), new CustomArrayData(1, 3, 6, 3d));
            CustomArrayData data1 = warehouse.get(array.getId());
            System.out.println(data1.getMinimum() + "\t" + data1.getMaximum() + "\t" + data1.getSum() + "\t" + data1.getAverage());
            array.setArray(5, 4, 3, 2, 1, 46579745, 21);
            System.out.println(data1.getMinimum() + "\t" + data1.getMaximum() + "\t" + data1.getSum() + "\t" + data1.getAverage());
        }
        catch (Exception exception) {
            System.out.println("Exception");
        }

    }
}
