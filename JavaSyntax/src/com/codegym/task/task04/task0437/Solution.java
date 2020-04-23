package com.codegym.task.task04.task0437;


/* 
Triangle of eights

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        for (int i = 1; i <= 10; i++) { // y
            for (int j = 1; j <= i; j++) { // x
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
