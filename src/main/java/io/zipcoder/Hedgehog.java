package io.zipcoder;

import java.util.Comparator;

public class Hedgehog extends Pet implements Comparable<Pet> {
    String petName;
    String petType = "Hedgehog";

    public Hedgehog() {}

    public Hedgehog(String name) {
        this.petName = name;
    }

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

    @Override
    public String getPetType() {
        return this.petType;
    }

    public int compareTo(Pet str) {
        return petName.compareTo(str.getPetName());
    }


}
