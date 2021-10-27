package com.company;

public class ArraySearch {

    public static boolean arraySearchBrute(int searchedNum, int[] array) {
        for (int element: array) {
            if (element == searchedNum) {
                return true;
            }
        }
        return false;
    }

    private static boolean arraySearchBinaryRecursive(int searchedNum, int[] array, int left, int right) {
        if (left > right) {
            return false;
        }

        int middle = (left + right) / 2;

        if (array[middle] == searchedNum) {
            return true;
        } else if (array[middle] > searchedNum) {
            return arraySearchBinaryRecursive(searchedNum, array, left, middle - 1);
        } else {
            return arraySearchBinaryRecursive(searchedNum, array, middle + 1, right);

        }
    }

    public static boolean arraySearchBinaryRecursive(int searchedNum, int[] array) {
        return arraySearchBinaryRecursive(searchedNum, array, 0, array.length - 1);
    }
}
