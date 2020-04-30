package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> sEntries = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {
            sEntries.add(reader.readLine());
        }

        for (int i=0; i<13; i++) {
            sEntries.add(0, sEntries.remove(sEntries.size() - 1));
        }

        for (String s : sEntries) {
            System.out.println(s);
        }
    }
}
