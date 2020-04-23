package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        int catScore = (this.age + this.weight + this.strength) * 5;
        int anotherCatScore = (anotherCat.age + anotherCat.weight + anotherCat.strength) * 5;

        return catScore > anotherCatScore;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.strength = 4;
        cat1.weight = 3;
        cat1.age = 5;

        cat2.strength = 9;
        cat2.weight = 6;
        cat2.age = 2;

        if (cat1.fight(cat2)) {
            System.out.println("Cat 1 wins!");
        } else {
            System.out.println("Cat 2 wins!");
        }
    }
}
