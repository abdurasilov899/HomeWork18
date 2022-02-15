package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow("KUK", "J", 6, 120);
        Cow cow2 = new Cow("JUS", "J", 5, 121);
        Cow cow3 = new Cow("AKU", "J", 8, 150);
        Cow cow4 = new Cow("LUK", "J", 7, 134);
        Cow cow5 = new Cow("LUX", "J", 9, 132);

        Sheep sheep1 = new Sheep("OLI", "J", 3, 42);
        Sheep sheep2 = new Sheep("JIK", "J", 2, 24);
        Sheep sheep3 = new Sheep("OKI", "J", 4, 39);

        Horse horse1 = new Horse("AKULA", "M", 6, 194, "Black");
        Horse horse2 = new Horse("SAMURAY", "M", 7, 197, "WHITE");

        Farm farm1 = new Farm("ASKAR", "KOK-DJAR", new Cow[]{cow1, cow2, cow3, cow4, cow5}, new Sheep[]{sheep1, sheep2, sheep3}, new Horse[]{horse1, horse2});
        Farm farm2 = new Farm("SANCHAR", "KDM", new Cow[]{cow1}, new Sheep[]{sheep1}, new Horse[]{horse1});
        System.out.println(farm1 + "\n " + farm2);
    }
}
