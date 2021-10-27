package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2 , 3};
        int[] weights = {2, 5, 10};

        Weights weights1 = new Weights(array, weights);

        System.out.println(weights1.getRandomFromArr());

    }
}
