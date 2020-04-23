package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        while (number > 0) {
            System.out.println(txt);
            number--;
        }
    }
}
