package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    //write your code here
    int left, top, width, height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

    public void initialize(Rectangle rectangle) {
        left = rectangle.left;
        top = rectangle.top;
        width = rectangle.width;
        height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
