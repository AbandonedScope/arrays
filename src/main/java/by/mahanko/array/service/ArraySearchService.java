package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;

import java.util.OptionalInt;

public interface ArraySearchService {
    OptionalInt findMaximum(CustomArray array);

    OptionalInt findMinimum(CustomArray array);

    long findAmountOfPositiveElements(CustomArray array);

    long findAmountOfNegativeElements(CustomArray array);
}
