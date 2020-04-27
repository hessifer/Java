package com.codegym.task.task06.task0605;


import java.io.*;

/* 
Controlling body weight

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            // write your code here
            double bmi = weight / (height * height);

            if (bmi < 18.5) {
                System.out.println("Underweight: BMI < 18.5");
            } else if (bmi < 25) {
                System.out.println("Normal: 18.5 <= BMI < 25");
            } else if (bmi < 30) {
                System.out.println("Overweight: 25 <= BMI < 30");
            } else {
                System.out.println("Obese: BMI >= 30");
            }
        }
    }
}