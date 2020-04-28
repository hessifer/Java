package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return numbers;
    }

    public static int max(int[] array) {
        // Find the maximum
        int middle = array.length / 2;
        int max = array[middle];

        for (int i = 0; i < middle; i++) {
            for (int j = array.length - 1; j > middle; j--) {
               int loopMax = Math.max(array[i], array[j]);
               if (loopMax > max) {
                   max = loopMax;
               }
            }
        }
        return max;
    }
}
