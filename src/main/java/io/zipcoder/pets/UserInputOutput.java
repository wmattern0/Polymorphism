package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by williammattern on 1/31/17.
 */
public class UserInputOutput {

    static Scanner scanner = new Scanner(System.in);


    static public int askHowManyPets(){
        System.out.println("How many pets do you have?");
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a number...");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static public String askNameOfPet(int i){
        System.out.println("What is pet number " + i  + "'s name?");
        return scanner.next();
    }

    static public String askTypeOfPet(int i){
        System.out.println("What type of pet is pet number " + i  +" ?");
        return scanner.next();
    }

    static void printListOfPets(ArrayList<Pet> petArrayList){
        for (Pet p:petArrayList){
            String petName = p.getName();
            String petNoise = p.speak();
            System.out.println(petName + " says " + petNoise);
        }
    }
}
