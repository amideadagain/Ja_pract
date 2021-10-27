package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(ArraySearch.arraySearchBinaryRecursive(5, array));
        System.out.println(9 == array[9]);
    }
}
