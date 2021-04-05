package io.zipcoder;


import java.lang.reflect.Array;
import java.util.*;

public class Application implements Comparator<Pet>{
    public Pet pet;
    int numOfPets;
    public ArrayList<Pet> petList = new ArrayList<Pet>();
    Console console = new Console(System.in, System.out);

    public Application() {}

    public ArrayList<Pet> run() {
        boolean running = true;
        while (running) {
            Integer input = console.getIntegerInput("How many pets do you have?");
            for (int i = 0; i < input; i++) {
                pet = new Pet();
                String type = console.getStringInput("What kind of pet?");
                String name = console.getStringInput("What is their name?");
                pet.setPetName(name);
                pet.setPetType(type);
                petList.add(pet);
            }
            running = false;
        }
        Collections.sort(petList);
        print(petList);
        return petList;
    }

    private void print(ArrayList<Pet> petList) {
        for (Pet p : petList) {
            System.out.println(p.getPetName() + " = " + p.getPetType());
        }
    }

    public Integer getNumberOfPets() {

        return petList.size();
    }

//    public void setPetNameType(String name, String petType) {
//        userPetMap.put(name, petType);
//    }

    public ArrayList<Pet> getUserPets() {

        return petList;
    }

    public int compare(Pet p1, Pet p2) {
        return p1.getPetType().compareTo(p2.getPetType());
    }
}
