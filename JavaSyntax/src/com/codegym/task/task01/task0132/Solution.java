package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int sum = 0;
        char[] cNumber = Integer.toString(number).toCharArray();

        for (char ch : cNumber) {
            sum += Integer.parseInt(Character.toString(ch));
        }
        return sum;
    }
}