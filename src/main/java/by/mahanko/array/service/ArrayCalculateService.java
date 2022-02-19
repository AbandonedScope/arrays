package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;

public interface ArrayCalculateService {
    int countElementsSum(CustomArray array) throws CustomException;

    double countAverage(CustomArray array) throws CustomException;
}
