package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int factor = 1;

        while (factor < 11) {
            int oLoop = 1;
            while (oLoop < 11) {
                System.out.print(oLoop * factor + " ");
                oLoop++;
            }
            System.out.println();
            factor++;
        }
    }
}
