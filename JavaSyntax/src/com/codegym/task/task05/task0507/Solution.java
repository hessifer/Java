package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double count = 0;
        double sum = 0;

        while (true) {
            int entry = Integer.parseInt(reader.readLine());

            if (entry == -1) {
                if (count != 0) {
                    System.out.println(sum / count);
                } else {
                    System.out.println(sum);
                }
                break;
            } else {
                sum += entry;
                count++;
            }
        }
    }
}

