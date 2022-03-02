package by.mahanko.array.entity;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayData {
    private OptionalInt maximum;
    private OptionalInt minimum;
    private int sum;
    private OptionalDouble average;

    public CustomArrayData() {
    }

    public CustomArrayData(OptionalInt maximum, OptionalInt minimum, int sum, OptionalDouble average) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.sum = sum;
        this.average = average;
    }

    public OptionalInt getMaximum() {
        return maximum;
    }

    public void setMaximum(OptionalInt maximum) {
        this.maximum = maximum;
    }

    public OptionalInt getMinimum() {
        return minimum;
    }

    public void setMinimum(OptionalInt minimum) {
        this.minimum = minimum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public OptionalDouble getAverage() {
        return average;
    }

    public void setAverage(OptionalDouble average) {
        this.average = average;
    }
}
