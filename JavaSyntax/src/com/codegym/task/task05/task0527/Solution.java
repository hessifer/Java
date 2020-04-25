package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //write your code here
        Cat tomCat = new Cat("Mixed", 2, "Grey");
        Dog dumbDog = new Dog("Bulldog", 5, "Grey");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
    public static class Dog {
        String breed;
        int age;
        String color;

        public Dog(String breed, int age, String color) {
            this.breed = breed;
            this.age = age;
            this.color = color;
        }
    }

    public static class Cat {
        String breed;
        int age;
        String color;

        public Cat(String breed, int age, String color) {
            this.breed = breed;
            this.age = age;
            this.color = color;
        }
    }
}
