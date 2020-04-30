package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> stuff = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            stuff.add(reader.readLine());
        }
        int shortestString = stuff.get(0).length();
        for (int i = 1; i < stuff.size(); i++) {
            int currentElementSize = stuff.get(i).length();
            if (currentElementSize < shortestString) {
                shortestString = currentElementSize;
            }
        }

        for (String s : stuff) {
            if (s.length() == shortestString) {
                System.out.println(s);
            }
        }
    }
}
