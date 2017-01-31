package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by williammattern on 1/30/17.
 */
public class PetsLevel3 {
    static Scanner scanner = new Scanner(System.in);
    static List<Pet> petsList = new ArrayList<Pet>();
    static HashMap<String,String> namesAndSpeakOutputs= new HashMap<>();
    static int numberOfPets;
    static PetFactory petFactory = new PetFactory();

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        numberOfPets = scanner.nextInt();
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("What is the name of pet number " + i + "?");
            String currentPetName = scanner.next();
            System.out.println("What is the type of pet number " + i + "?");
            String currentPetType = scanner.next();
            petsList.add(petFactory.setPet(currentPetType, currentPetName));
        }
        for (Pet p: petsList){
            namesAndSpeakOutputs.put(p.getName(),p.speak());
        }
        System.out.println(namesAndSpeakOutputs.toString());

    }
}
