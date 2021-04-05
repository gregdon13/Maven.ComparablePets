package io.zipcoder;

import java.util.Comparator;

public class Cat extends Pet implements Comparable<Pet> {
    String petName;
    String petType = "Cat";

    public Cat() {}

    public Cat(String name, String type) {
        this.petName = name;
        this.petType = type;
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
    public String speak() {
        return "meow";
    }

    @Override
    public String getPetType() {
        return this.petType;
    }

    public int compareTo(Pet str) {
        return petName.compareTo(str.getPetName());
    }
}
