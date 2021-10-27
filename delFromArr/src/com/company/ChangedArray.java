package com.company;

import java.util.Arrays;

class ChangedArray {

    int[] array;

    ChangedArray(int[] array) {
        this.array = array;
    }

    int[] delElement(int delNumber) {
        int counter = 0;
        for (int i = 0; i < array.length - counter; i++) {
            if (array[i] == delNumber) {
                counter++;
                shift(i);
            }
        }
        array = Arrays.copyOf(array, array.length - counter);
        return array;
    }

    private void shift(int shiftPosition) {
        for (int j = shiftPosition; j < array.length - 1; j++) {
            swap(j, j + 1);
        }
    }

    private void swap(int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
