package io.zipcoder;

import java.util.Comparator;

public class Dog extends Pet implements Comparable<Pet> {
    String petName;

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

    public int compareTo(Pet str) {
        return petType.compareTo(str.getPetType());
    }
}
