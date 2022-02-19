package by.mahanko.array.entity;

import by.mahanko.array.exception.CustomException;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int... array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int... array) {
        this.array = array;
    }

    public int getElement(int index) throws CustomException {
        if (index < 0 || index >= array.length) {
            throw new CustomException();
        }

        return array[index];
    }

    public void setElement(int index, int value) throws CustomException {
        if (index < 0 || index >= array.length) {
            throw new CustomException();
        }

        array[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element + " ");
        }

        return stringBuilder.toString();
    }
}
