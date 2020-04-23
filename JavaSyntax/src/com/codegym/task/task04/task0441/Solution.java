package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int middle = num1;

        if (num2 < num1 && num2 > num3) {
            middle = num2;
        } else if (num2 < num3 && num2 > num1) {
           middle = num2;
        } else if (num3 < num1 && num3 > num2) {
            middle = num3;
        } else if (num3 < num2 && num3 > num1) {
            middle = num3;
        } else if (num1 == num2 || num1 == num3) {
            middle = num1;
        } else if (num2 == num3) {
            middle = num2;
        }
        System.out.println(middle);
    }
}
