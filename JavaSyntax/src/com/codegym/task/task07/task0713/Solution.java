package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> bitBucket = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (int number : numbers) {
            if (number % 3 == 0 && number % 2 == 0) {
                divByThree.add(number);
                divByTwo.add(number);
            } else if (number % 3 == 0) {
                divByThree.add(number);
            } else if (number % 2 == 0) {
                divByTwo.add(number);
            } else {
                bitBucket.add(number);
            }
        }
        printList(divByThree);
        printList(divByTwo);
        printList(bitBucket);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int i : list) {
            System.out.println(i);
        }
    }
}
