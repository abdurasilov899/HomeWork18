package com.company;

import java.util.Arrays;

public abstract class Abstract {
    private String name;
    private String address;
    private Cow[] cow;
    private Sheep[] sheep;
    private Horse[] horse;

    public Abstract(String name, String address, Cow[] cow, Sheep[] sheep, Horse[] horse) {
        this.name = name;
        this.address = address;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return " " + name +
                " " + address +
                " " + Arrays.toString(cow) +
                " " + Arrays.toString(sheep) +
                " " + Arrays.toString(horse);
    }
}
