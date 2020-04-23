package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] numbers = getNumbers();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int number : numbers) {
            if (number == 0) {
                zeroCount++;
            } else if (isPositive(number)) {
                positiveCount++;
            } else negativeCount++;
        }
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
    }

    private static int[] getNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        return new int[]{number1, number2, number3};
    }

    private static boolean isPositive(int number) {
        return number > 0;
    }
}
