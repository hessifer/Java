package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0 && number < 1000) {
            String digits = numberOfDigits(number);

            if (isEven(number)) {
                System.out.println("even " + digits + " number");
            } else {
                System.out.println("odd " + digits + " number");
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String numberOfDigits(int number) {
        if (number < 10) {
            return "single-digit";
        } else if (number < 100) {
            return "two-digit";
        } else {
            return "three-digit";
        }
    }
}
