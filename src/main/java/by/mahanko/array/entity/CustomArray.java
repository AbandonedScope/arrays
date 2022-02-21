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
        this.array = array.clone();
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (obj instanceof CustomArray arrayToEqualTo) {
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
        } else {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = this.array.hashCode();
        return hashCode;
    }

}
