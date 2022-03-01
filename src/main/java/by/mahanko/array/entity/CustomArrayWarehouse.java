package by.mahanko.array.entity;

import by.mahanko.array.observer.CustomArrayObserver;
import by.mahanko.array.observer.impl.CustomArrayEvent;
import by.mahanko.array.service.ArrayCalculateService;
import by.mahanko.array.service.impl.ArrayCalculateServiceImpl;
import by.mahanko.array.service.impl.ArraySearchServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayWarehouse implements CustomArrayObserver {
    private Map<String, CustomArrayData> arrays;
    private static CustomArrayWarehouse instance;

    private CustomArrayWarehouse() {
        arrays = new HashMap<>();
    }

    public static CustomArrayWarehouse getInstance() {
        if (instance == null) {
            instance = new CustomArrayWarehouse();
        }

        return instance;
    }

    public CustomArrayData get(String id) {
        return arrays.get(id);
    }

    public CustomArrayData put(String id, CustomArrayData value) {
        return arrays.put(id, value);
    }

    public boolean remove(String key, CustomArrayData value) {
        return arrays.remove(key, value);
    }

    @Override
    public void arrayChanged(CustomArrayEvent event) {
        CustomArray changedArray = event.getSource();
        CustomArrayData arrayData = get(changedArray.getId());
        ArraySearchServiceImpl searchService = new ArraySearchServiceImpl();
        ArrayCalculateServiceImpl calculateService = new ArrayCalculateServiceImpl();
        OptionalInt minimum = searchService.findMinimum(changedArray);
        if (minimum.isPresent()) {
            arrayData.setMinimum(minimum.getAsInt());
        }

        OptionalInt maximum = searchService.findMaximum(changedArray);
        if (maximum.isPresent()) {
            arrayData.setMaximum(maximum.getAsInt());
        }

        int sum = calculateService.countElementsSum(changedArray);
        arrayData.setSum(sum);
        OptionalDouble average = calculateService.countAverage(changedArray);
        if (average.isPresent()) {
            arrayData.setAverage(average.getAsDouble());
        }
    }
}
