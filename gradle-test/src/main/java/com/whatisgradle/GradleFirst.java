package com.whatisgradle;

public class GradleFirst {
    public static void main(String[] args) {
        int a = 0, b = 50, min = b, max = a, sumAverage = 0;
        int[] randomNumbers = new int[50];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = a + (int) (Math.random() * b + 1);
        }

        //System.out.println(Arrays.toString(randomNumbers));

        for (int i : randomNumbers) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
            sumAverage += i;
        }
        System.out.println("Min: " + min + " Max: " + max + " Average: " +(float) sumAverage/randomNumbers.length);
    }
}