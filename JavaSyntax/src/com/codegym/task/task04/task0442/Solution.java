package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        while (true) {
            int num1 = Integer.parseInt(reader.readLine());
            total += num1;

            if (num1 == -1) {
                break;
            }
        }
        System.out.println(total);
    }
}
