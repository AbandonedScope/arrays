package by.mahanko.array;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.ArraySortService;

public class App {
    public static void main(String[] args) {
        CustomArray array = new CustomArray(9,8,7,6,5,4,3,2,1,0);
        ArraySortService sorter = new ArraySortService();
        try {
            sorter.mergeSort(array);
            System.out.println(array.toString());
        }
        catch (Exception exception) {
            System.out.println(exception.getCause());
        }

    }
}
