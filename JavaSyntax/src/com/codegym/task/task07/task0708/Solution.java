package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int longestEntry = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
           int currentElementSize = strings.get(i).length();
           if (currentElementSize > longestEntry) {
               longestEntry = currentElementSize;
           }
        }

        for (String string : strings) {
            if (string.length() == longestEntry) {
                System.out.println(string);
            }
        }
    }
}
