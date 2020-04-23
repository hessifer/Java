package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Enter the length of side 1: ");
        String sLine1 = reader.readLine();
        // System.out.print("Enter the length of side 2: ");
        String sLine2 =reader.readLine();
        // System.out.print("Enter the length of side 3: ");
        String sLine3 = reader.readLine();
        int line1 = Integer.parseInt(sLine1);
        int line2 = Integer.parseInt(sLine2);
        int line3 = Integer.parseInt(sLine3);

        if (isTriangle(line1, line2, line3)) {
            System.out.println("The triangle is possible.");
        } else {
            System.out.println("The triangle is not possible.");
        }

    }

    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }
}