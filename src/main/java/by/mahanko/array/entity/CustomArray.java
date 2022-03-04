package by.mahanko.array.entity;

import by.mahanko.array.exception.CustomException;
import by.mahanko.array.util.impl.CustomArrayIdGeneratorImpl;

import java.util.Arrays;

public class CustomArray extends CustomArrayObservableImpl {
    private final String id;
    private int[] array;

    public CustomArray() {
        this.id = CustomArrayIdGeneratorImpl.getInstance().generate();
        this.array = new int[0];
    }

    public CustomArray(int... array) {
        this.id = CustomArrayIdGeneratorImpl.getInstance().generate();
        this.array = array.clone();
    }

    public int length() {
        return array.length;
    }

    public String getId() {
        return id;
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int... array) {
        this.array = array.clone();
        notifyObservers();
    }

    public int getElement(int index) throws CustomException {
        if (index < 0 || index >= array.length) {
            throw new CustomException("Index out of range");
        }

        return array[index];
    }

    public void setElement(int index, int value) throws CustomException {
        if (index < 0 || index >= array.length) {
            throw new CustomException("Index out of range");
        }

        array[index] = value;
        notifyObservers();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element).append(" ");
        }

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        CustomArray arrayToEqualTo = (CustomArray) obj;
        if (arrayToEqualTo.array == null || this.array == null) {
            return arrayToEqualTo.array == null && this.array == null;
        }

        if (length() != arrayToEqualTo.length()) {
            return false;
        }

        for (int i = 0; i < length(); i++) {
            if (this.array[i] != arrayToEqualTo.array[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
