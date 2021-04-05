package io.zipcoder;

import java.util.Comparator;

public class Dog extends Pet implements Comparable<Pet> {
    String petName;
    String petType = "Dog";

    public Dog() {}

    public Dog(String name) {
        this.petName = name;
    }

    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String getPetType() {
        return this.petType;
    }

    public int compareTo(Pet str) {
        return petName.compareTo(str.getPetName());
    }
}
