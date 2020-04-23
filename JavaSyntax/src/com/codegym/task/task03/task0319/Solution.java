package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Name: ");
        String name = reader.readLine();

        // System.out.print("Number1: ");
        String sNumber1 = reader.readLine();
        int number1 = Integer.parseInt(sNumber1);

        // System.out.print("Number2: ");
        String sNumber2 = reader.readLine();
        int number2 = Integer.parseInt(sNumber2);

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
