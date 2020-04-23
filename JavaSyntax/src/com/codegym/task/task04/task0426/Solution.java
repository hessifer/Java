package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Negative even number");
            } else {
                System.out.println("Negative odd number");
            }
        } else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }
        } else System.out.println("Zero");
    }
}
