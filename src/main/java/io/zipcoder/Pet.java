package io.zipcoder;

public class Pet implements Comparable<Pet>{
    String petName;
    String petType;

    public String speak() {
        return "noise";
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return this.petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int compareTo(Pet o) {
        return this.petType.compareTo(o.getPetType());
    }
}
