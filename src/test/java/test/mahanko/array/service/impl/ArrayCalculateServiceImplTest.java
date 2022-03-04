package test.mahanko.array.service.impl;

import by.mahanko.array.entity.CustomArray;
import by.mahanko.array.service.impl.ArrayCalculateServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayCalculateServiceImplTest {

    private final ArrayCalculateServiceImpl service = new ArrayCalculateServiceImpl();
    private final CustomArray entityBaseArray = new CustomArray(5, 8, 12, 3, -4, 6, -9);
    private final CustomArray entityEqualPositiveNumbersArray = new CustomArray(2, 2, 2, 2, 2, 2, 2, 2);
    private final CustomArray entityEqualNegativeNumbersArray = new CustomArray(-2, -2, -2, -2, -2, -2, -2, -2);
    private final CustomArray entityArrayOfZeros = new CustomArray(0, 0, 0, 0, 0, 0, 0, 0);
    private final CustomArray entityEmptyArray = new CustomArray(new int[0]);

    @Test
    public void countElementSumBaseArrayTest() {
        int actual = service.countElementsSum(entityBaseArray);
        int expected = 21;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countElementsSumEqualPositiveNumbersTest() {
        int actual = service.countElementsSum(entityEqualPositiveNumbersArray);
        int expected = 16;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countElementsSumEqualNegativeNumbersTest() {
        int actual = service.countElementsSum(entityEqualNegativeNumbersArray);
        int expected = -16;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countElementsSumArrayOfZeroesTest() {
        int actual = service.countElementsSum(entityArrayOfZeros);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countElementsSumEmptyArrayTest() {
        int actual = service.countElementsSum(entityEmptyArray);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countAverageBaseArrayTest() {
        double actual = service.countAverage(entityBaseArray).getAsDouble();
        double expected = 3d;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countAverageEqualPositiveNumbersTest() {
        double actual = service.countAverage(entityEqualPositiveNumbersArray).getAsDouble();
        double expected = 2d;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countAverageEqualNegativeNumbersTest() {
        double actual = service.countAverage(entityEqualNegativeNumbersArray).getAsDouble();
        double expected = -2d;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countAverageArrayOfZerosTest() {
        double actual = service.countAverage(entityArrayOfZeros).getAsDouble();
        double expected = 0d;
        Assert.assertEquals(actual, expected);
    }
}
