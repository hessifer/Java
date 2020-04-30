package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> sEntries = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            sEntries.add(reader.readLine());
        }
        String shortest = sEntries.get(0);
        String longest = sEntries.get(0);
        int shortestPos = 0;
        int longestPos = 0;


        for (int i=1; i<sEntries.size(); i++) {
            int entryLength = sEntries.get(i).length();
            String element = sEntries.get(i);

            if (entryLength < shortest.length()) {
                shortestPos = i;
                shortest = element;
            } else if (entryLength > longest.length()) {
                longestPos = i;
                longest = element;
            }
        }

        if (shortestPos < longestPos) {
            System.out.println(shortest);
        } else {
            System.out.println(longest);
        }
    }
}
