package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    String name;
    String address;
    String color;
    int weight;
    int age;

    public void initialize(String name) {
        this.name = name;
        color = "blue";
        weight = 12;
        age = 2;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "green";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 14;
        color = "lime";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 4;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 3;
    }

    public static void main(String[] args) {

    }
}
