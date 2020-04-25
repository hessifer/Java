package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        while (true) {
            String input = reader.readLine();
            if (input.equals("sum")) {
                break;
            } else {
                total += Integer.parseInt(input);
            }
        }
        System.out.println(total);
    }
}
