package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;

import java.util.OptionalDouble;

public interface ArrayCalculateService {
    int countElementsSum(CustomArray array) throws CustomException;

    OptionalDouble countAverage(CustomArray array) throws CustomException;
}
