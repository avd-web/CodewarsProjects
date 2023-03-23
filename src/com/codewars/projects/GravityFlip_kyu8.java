package com.codewars.projects;

import java.util.Arrays;

public class GravityFlip_kyu8 {
    public static void main(String[] args) {
        char dir = 'L';
        int[] arr = {3, 0, 1, };
        int arrSize = arr.length;

        int smallest;

        if (dir == 'R') {
            for (int i = 0; i < arrSize - 1; i++) {
                smallest = i;
                for (int j = i + 1; j < arrSize; j++) {
                    if (arr[j] < arr[smallest]) {
                        smallest = j;
                    }

                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
        if (dir == 'L') {
            for (int i = 0; i < arrSize - 1; i++) {
                smallest = i;
                for (int j = i + 1; j < arrSize; j++) {
                    if (arr[j] > arr[smallest]) {
                        smallest = j;
                    }

                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
