package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

        // Let's sort using quick sort
        QuickSort.quickSort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }

}