package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int positiveIntCount = 0;

        int[] numbers = new int[]{number1, number2, number3};
        for (int number : numbers) {
            if (isPositive(number)) {
                positiveIntCount++;
            }
        }

        System.out.println(positiveIntCount);
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}
