package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        zerg1.name = "blue";
        Zerg zerg2 = new Zerg();
        zerg2.name = "bue";
        Zerg zerg3 = new Zerg();
        zerg3.name = "be";
        Zerg zerg4 = new Zerg();
        zerg4.name = "yellow";
        Zerg zerg5 = new Zerg();
        zerg5.name = "green";

        Protoss protoss1 = new Protoss();
        protoss1.name = "apple";
        Protoss protoss2 = new Protoss();
        protoss2.name = "pear";
        Protoss protoss3 = new Protoss();
        protoss3.name = "banana";

        Terran terran1 = new Terran();
        terran1.name = "almond";
        Terran terran2 = new Terran();
        terran2.name = "walnut";
        Terran terran3 = new Terran();
        terran3.name = "coconut";
        Terran terran4 = new Terran();
        terran4.name = "cashew";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
