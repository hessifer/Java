package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Enter a number: ");
        String sNumber = reader.readLine();
        int number = Integer.parseInt(sNumber);

        if (number == 0) {
            System.out.println(number);
        } else if (number > 0) {
            System.out.println(number * 2);
        } else {
            System.out.println(number + 1);
        }
    }

}