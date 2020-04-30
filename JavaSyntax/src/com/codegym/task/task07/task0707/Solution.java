package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> stuff = new ArrayList<>();
        stuff.add("A");
        stuff.add("quick");
        stuff.add("brown");
        stuff.add("fox");
        stuff.add("sighed");

        System.out.println(stuff.size());
        for (String s : stuff) {
            System.out.println(s);
        }
    }
}
