package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int a = 0, b = 10;
        int[] randomNumbers = new int[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = a + (int) (Math.random() * b);
        }

        System.out.println(Arrays.toString(randomNumbers));

        ChangedArray newArray = new ChangedArray(randomNumbers);

        newArray.delElement(6);
        randomNumbers = newArray.delElement(7);

        System.out.println(Arrays.toString(randomNumbers));

    }
//so stupid
}
/*
Correct one

    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};

        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        return Arrays.copyOf(nums, nums.length - offset);
    }

 */