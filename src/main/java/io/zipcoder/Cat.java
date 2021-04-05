package io.zipcoder;

import java.util.Comparator;

public class Cat extends Pet implements Comparable<Pet> {
    String petName;

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

    public int compareTo(Pet str) {
        return petType.compareTo(str.getPetType());
    }
}
