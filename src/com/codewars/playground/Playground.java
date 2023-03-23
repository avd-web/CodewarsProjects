package com.codewars.playground;

import java.util.Arrays;

public class Playground {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 2};
        char dir = 'R';
        int intArraySize = arr.length;
        int[] temp = new int[intArraySize];
        int[] sortedIntArray = new int[intArraySize];

        if (dir == 'R') {
            for (int i = 0; i < (intArraySize - 1); i++) {
                if (arr[i] > arr[(i + 1)]) {

                    temp[i] = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp[i + 1];

                } else {
                    sortedIntArray[i] = arr[i];
                }
            }

        } else if (dir == 'L') {
            for (int i = 0; i < (intArraySize - 1); i++) {
                if (arr[i] < arr[i + 1]) {
                }
            }
        }
        System.out.println(Arrays.toString(sortedIntArray));
    }
}

