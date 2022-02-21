package by.mahanko.array.creator.impl;

import by.mahanko.array.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayCreatorImpl {
    private static Logger logger = LogManager.getLogger(CustomArrayCreatorImpl.class.getName());

    public CustomArray createCustomArray(int[] array) {
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }
}
