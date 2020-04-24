package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("bob", 2, 20, 10);
        Cat cat2 = new Cat("jane", 1, 20, 1);
        Cat cat3 = new Cat("meow", 5, 20, 13);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}