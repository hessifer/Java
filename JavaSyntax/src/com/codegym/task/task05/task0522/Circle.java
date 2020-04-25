package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //write your code here
    public Circle() {
        x = 1.2;
        y = 3.4;
        radius = 4.5;
    }

    public Circle(double x) {
        this.x = x;
        y = 3.4;
        radius = 3.4;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        radius = 1.1;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}