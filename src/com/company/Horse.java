package com.company;

public class Horse extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Horse(String name, String gender, int age, double weight, String color) {
        super(name, gender, age, weight);
        this.color = color;

    }
}
