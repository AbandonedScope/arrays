package by.mahanko.array.comparator;

import by.mahanko.array.entity.CustomArray;

import java.util.Comparator;

public class CustomArrayLengthComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray) {
        int answer = 0;
        if (firstArray.length() > secondArray.length()) {
            answer = 1;
        } else if (firstArray.length() < secondArray.length()) {
            answer = -1;
        }

        return answer;
    }
}
