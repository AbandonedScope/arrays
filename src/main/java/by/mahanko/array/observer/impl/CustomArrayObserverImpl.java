package by.mahanko.array.observer.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.entity.CustomArrayData;
import by.mahanko.array.entity.CustomArrayWarehouse;
import by.mahanko.array.observer.CustomArrayObserver;
import by.mahanko.array.observer.impl.CustomArrayEvent;
import by.mahanko.array.service.impl.ArrayCalculateServiceImpl;
import by.mahanko.array.service.impl.ArraySearchServiceImpl;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayObserverImpl implements CustomArrayObserver {

    @Override
    public void arrayChanged(CustomArrayEvent event) {
        CustomArray changedArray = event.getSource();
        CustomArrayData arrayData = CustomArrayWarehouse.getInstance().get(changedArray.getId());
        ArraySearchServiceImpl searchService = new ArraySearchServiceImpl();
        ArrayCalculateServiceImpl calculateService = new ArrayCalculateServiceImpl();
        OptionalInt minimum = searchService.findMinimum(changedArray);
        arrayData.setMinimum(minimum);
        OptionalInt maximum = searchService.findMaximum(changedArray);
        arrayData.setMaximum(maximum);
        int sum = calculateService.countElementsSum(changedArray);
        arrayData.setSum(sum);
        OptionalDouble average = calculateService.countAverage(changedArray);
        arrayData.setAverage(average);
    }
}
