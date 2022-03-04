package by.mahanko.array.creator.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.creator.CustomArrayCreator;

public class CustomArrayCreatorImpl implements CustomArrayCreator{
    @Override
    public CustomArray createCustomArray(int[] array) {
        return new CustomArray(array);
    }
}
