package com.codegym.task.task03.task0325;

import java.io.*;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDollar = reader.readLine();
        int dollar = Integer.parseInt(sDollar);

        System.out.println("I will earn $" + dollar + " per hour");
    }
}
