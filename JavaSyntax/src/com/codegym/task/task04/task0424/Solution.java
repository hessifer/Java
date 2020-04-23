package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        if (number1 == number2 && number1 == number3) {
            System.out.println("All three numbers are the same.");
        } else if (number1 == number2) {
            System.out.println(3);
        } else if (number2 == number3) {
            System.out.println(1);
        } else if (number1 == number3) {
            System.out.println(2);
        }
    }
}
