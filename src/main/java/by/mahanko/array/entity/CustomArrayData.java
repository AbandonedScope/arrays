package by.mahanko.array.entity;

public class CustomArrayData {
    private int maximum;
    private int minimum;
    private int sum;
    private double average;

    public CustomArrayData() {
    }

    public CustomArrayData(int maximum, int minimum, int sum, double average) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.sum = sum;
        this.average = average;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
