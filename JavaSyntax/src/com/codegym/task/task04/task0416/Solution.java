package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sTime = reader.readLine();
        double mins = Double.parseDouble(sTime);

        System.out.println(trafficLightColor(mins));
    }

    public static String trafficLightColor(double minutes) {
        // round trip is 5
        double result = minutes % 5;
        String color = "";

        if (result >= 0 && result < 3) {
            color =  "green";
        } else if (result >= 3 && result < 4) {
            color = "yellow";
        } else if ( result >= 4 && result < 5) {
            color = "red";
        }
        return color;
    }
}