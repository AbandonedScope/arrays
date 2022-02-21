package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;

import java.util.OptionalInt;

public interface ArraySearchService {
    OptionalInt findMaximum(CustomArray array) throws CustomException;

    OptionalInt findMinimum(CustomArray array) throws CustomException;

    long findAmountOfPositiveElements(CustomArray array) throws CustomException;

    long findAmountOfNegativeElements(CustomArray array) throws CustomException;
}
