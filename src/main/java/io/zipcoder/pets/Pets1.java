package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by williammattern on 1/30/17.
 */
public class Pets1 {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfPets;

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        numberOfPets = scanner.nextInt();
        ArrayList<String> petNamesList = new ArrayList<String>(numberOfPets);
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("What is the name of pet number " + i + "?");
            String currentPetName = scanner.next();
            petNamesList.add(currentPetName);
        }
        System.out.println(petNamesList.toString());

    }

}
