package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;

import java.util.OptionalDouble;

public interface ArrayCalculateService {
    int countElementsSum(CustomArray array);

    OptionalDouble countAverage(CustomArray array);
}
