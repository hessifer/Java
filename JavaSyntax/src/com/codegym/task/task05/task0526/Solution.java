package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("Charles", 27, "123 elm street");
        Man man2 = new Man("Mackey", 37,"123 beach street");
        Woman woman1 = new Woman("Kelly", 23, "1223 Super Nova");
        Woman woman2 = new Woman("Damaris", 25, "1223 San Diego St");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //write your code here
    public static class Man {
        String name;
        String address;
        int age;

        public Man(String name, int age, String address) {
           this.name = name;
           this.address = address;
           this.age = age;
        }
    }

    public static class Woman {
        String name;
        String address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
}
