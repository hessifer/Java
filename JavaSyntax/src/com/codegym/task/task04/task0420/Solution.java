package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
// import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int[] numArray = new int[]{number1, number2, number3};
        /*
        // use Arrays.sort()
        Arrays.sort(numArray);

        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();

        for (int num : numArray) {
            System.out.print(num + " ");
        }
        */

        // bubble sort
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                int tmp;

                if (numArray[i] < numArray[j]) {
                    tmp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = tmp;
                }
            }
        }

        for (int num : numArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
