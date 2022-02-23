package by.mahanko.array.main.creator.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.main.creator.CustomArrayCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayCreatorImpl implements CustomArrayCreator{
    private static Logger logger = LogManager.getLogger(CustomArrayCreatorImpl.class.getName());

    @Override
    public CustomArray createCustomArray(int[] array) {
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }
}
