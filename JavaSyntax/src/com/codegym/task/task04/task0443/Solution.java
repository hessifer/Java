package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String birthYear = reader.readLine();
        String birthMonth = reader.readLine();
        String birthDay = reader.readLine();

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + birthMonth + "/" + birthDay + "/" + birthYear);
    }
}
