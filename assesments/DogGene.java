package assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogGene {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();

        ArrayList<String> dogBreeds = new ArrayList<>(Arrays.asList("Bulldog", "Labrador", "Husky",
                "Yorkshire Terrier", "Cockers Spaniel" ));
        ArrayList<Integer> percentages = generatePercentageList(generator, dogBreeds);

        System.out.println("What is your dog's name?");
        String dogName = keyboard.nextLine();

        System.out.println("Well, then I have this highly reliable report on " +
                dogName + "'s prestigious background here.");
        System.out.println(dogName + " is:");

        for (int i=0; i < percentages.size(); i++) {
            System.out.println(percentages.get(i) + "% " + dogBreeds.get(i));
        }
    }
    public static ArrayList<Integer> generatePercentageList (Random generator, ArrayList<String> dogBreeds) {
        ArrayList<Integer> percentages = new ArrayList<>();

        int percentageTotal = 0;
        for (int i=0; i < dogBreeds.size() - 1; i++) {
            int percentage = generator.nextInt(100 - percentageTotal);
            percentages.add(percentage);
            percentageTotal += percentage;
        }
        int finalPercentage = 100 - percentageTotal;
        percentages.add(finalPercentage);

        return percentages;
    }}