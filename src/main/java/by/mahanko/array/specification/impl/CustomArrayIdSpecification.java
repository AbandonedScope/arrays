package by.mahanko.array.specification.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.specification.CustomArraySpecification;

public class CustomArrayIdSpecification implements CustomArraySpecification {
    private final String arrayId;

    public CustomArrayIdSpecification(String arrayId) {
        this.arrayId = arrayId;
    }

    @Override
    public boolean specify(CustomArray array) {
        if (array == null) {
            return false;
        }

        return this.arrayId.equals(array.getId());
    }
}
