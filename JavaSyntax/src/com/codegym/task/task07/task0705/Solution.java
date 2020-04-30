package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] numbersTwenty = new int[20];
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;

        for (int i = 0; i < 20; i++) {
            numbersTwenty[i] = Integer.parseInt(reader.readLine());

            if (i < 10) {
                numbers1[i] = numbersTwenty[i];
            } else {
                numbers2[counter] = numbersTwenty[i];
                counter++;
            }
        }

        for (int num : numbers2) {
            System.out.println(num);
        }
    }
}
