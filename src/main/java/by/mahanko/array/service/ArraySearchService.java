package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;

public interface ArraySearchService {
    int findMaximum(CustomArray array) throws CustomException;

    int findMinimum(CustomArray array) throws CustomException;

    int findAmountOfPositiveElements(CustomArray array) throws CustomException;

    int findAmountOfNegativeElements(CustomArray array) throws CustomException;
}
