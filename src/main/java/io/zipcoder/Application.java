package io.zipcoder;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public Pet pet = new Pet();
    public Map<String, String> userPetMap = new HashMap<String, String>();
    Console console = new Console(System.in, System.out);

    public Application() {}

    public void run() {
        boolean running = true;
        while (running) {
            Integer input = console.getIntegerInput("How many pets do you have?");
            for (int i = 0; i < input; i++) {
                String type = console.getStringInput("What kind of pet?");
                String name = console.getStringInput("What is their name?");
                userPetMap.put(type, name);
            }
            System.out.println(userPetMap);
            running = false;
        }
    }

    public Integer getNumberOfPets() {
        return null;
    }

    public void setNumberOfPets(int numOfPets) {
    }

    public void setPetNameType(String name, String petType) {
    }

    public Map getUserPets() {
        return null;
    }
}
