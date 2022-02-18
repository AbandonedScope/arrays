package by.mahanko.array;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.ArraySortService;


public class App {
    public static void main(String[] args) {
        long time = System.nanoTime();
        CustomArray array = new CustomArray();
        ArraySortService sorter = new ArraySortService();
        try {
            sorter.mergeSort(array);
            System.out.println(array);
            long end = System.nanoTime();
            System.out.println(end - time);
        }
        catch (Exception exception) {
            System.out.println(exception.getCause());
        }

    }
}
