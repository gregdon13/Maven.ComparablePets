package io.zipcoder;

import java.util.Comparator;

public class Hedgehog extends Pet implements Comparable<Pet> {
    String petName;
    String petType;

    @Override
    public String speak() {
        return "huff";
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
