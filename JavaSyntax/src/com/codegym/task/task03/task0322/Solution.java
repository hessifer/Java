package com.codegym.task.task03.task0322;


/* 
Deep and pure love

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Name 1: ");
        String name1 = reader.readLine();

        // System.out.print("Name 2: ");
        String name2 = reader.readLine();

        // System.out.print("Name 3: ");
        String name3 = reader.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love. Ooo la-la!");
    }
}