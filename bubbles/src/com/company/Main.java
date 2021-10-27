package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[99];
        ArrayList<Integer> simpleNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int n = 24;
        for (int i: numbers) {
            if (i < 2){
                continue;
            }
            boolean isSimple = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                simpleNumbers.add(i);
            }
        }
        for (int i: simpleNumbers) {
            System.out.println(i);
        }

    }
}
