package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name;
    String address;
    String color;
    int age;
    int weight;

    public Cat(String name) {
        this.name = name;
        age = 23;
        weight = 143;
        color = "blue";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "green";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 120;
        color = "pink";
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        age = 27;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 33;
    }

    public static void main(String[] args) {

    }
}
