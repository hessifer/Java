package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int evenPopulation = 0;
        int oddPopulation = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                evenPopulation += numbers[i];
            } else {
                oddPopulation += numbers[i];
            }
        }

        if (evenPopulation > oddPopulation) {
            System.out.println("Even-numbered houses have more residents.");
        } else {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
