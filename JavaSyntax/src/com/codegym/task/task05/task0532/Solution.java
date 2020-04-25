package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int iterCount = Integer.parseInt(reader.readLine());

        if (iterCount > 0) {
            int maximum = Integer.parseInt(reader.readLine());

            while (iterCount > 1) {
                int input = Integer.parseInt(reader.readLine());

                if (input > maximum) {
                    maximum = input;
                }
                iterCount--;
            }
            System.out.println(maximum);
        }
    }
}
