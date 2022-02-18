package by.mahanko.array.entity;

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

    public int getElement(int index) throws ArrayException {
        if (index < 0 || index >= array.length) {
            throw new ArrayException();
        }

        return array[index];
    }

    public void setElement(int index, int value) throws ArrayException {
        if (index < 0 || index >= array.length) {
            throw new ArrayException();
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
