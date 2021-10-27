package com.company;

public class Weights {
    private int[] valuesArr;
    private int[] weightsArr;

    public Weights(int[] valuesArr, int[] weightsArr) {
        this.valuesArr = valuesArr;
        this.weightsArr = weightsArr;
    }

    private int valuesSum() {
        int valSum = 0;
        for (int i : weightsArr){
            valSum += i;
        }
        return valSum;
    }

    private int genRandom(int max) {
        return (int) (Math.random() * max + 1);
    }

    private int getIndex() {
        int number = genRandom(valuesSum());
        //System.out.println(number);

        int a = 0;
        for (int i = 0; i < valuesArr.length; i++) {
            if (a < number && number < a + weightsArr[i]) {
                return i;
            }
            a += weightsArr[i];
        }
        return 0;
    }

    public int getRandomFromArr() {
        return valuesArr[getIndex()];
    }
}
