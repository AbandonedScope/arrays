package by.mahanko.array.service;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.exception.CustomException;

public interface ArrayManipulationService {
    void replaceAllNegativeElements(CustomArray array, int valueToReplaceWith) throws CustomException;

    void replaceAllElementInRegion(CustomArray array, int lowerBound, int uppedBound, int valueToReplaceWith) throws CustomException;
}
