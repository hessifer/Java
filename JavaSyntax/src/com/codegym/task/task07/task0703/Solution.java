package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] sEntries = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < sEntries.length; i++) {
            sEntries[i] = reader.readLine();
            numbers[i] = sEntries[i].length();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
