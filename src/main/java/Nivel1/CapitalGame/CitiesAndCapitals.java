package Nivel1.CapitalGame;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class CitiesAndCapitals {

    private HashMap<String, String> capitalCities = new HashMap<>();
    private String name;

    public void readCities() {
        DocsManagement docs = new DocsManagement();
        List<String> lines = docs.readFile("countries.txt");
        for (String line : lines) {
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                String country = parts[0];
                String city = parts[1];
                capitalCities.put(country, city);
            }
        }
    }

    public void askName(Scanner sc) {
        System.out.print("What's your name?");
        this.name = sc.nextLine();
    }

    public List<String> prepareGame() {
        List<String> countries = new ArrayList<>(capitalCities.keySet());
        Collections.shuffle(countries);
        return countries.subList(0, Math.min(10, countries.size()));
    }

    public void play(Scanner sc) {
        List<String> countries = prepareGame();
        int score = 0;

        for (String country : countries) {
            System.out.print("The capital of " + country + " is: ");
            String answer = sc.nextLine().trim();
            String capital = capitalCities.get(country);
            String userAnswer = answer.replace("_", " ");
            String correctAnswer = capital.replace("_", " ");

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The capital of " + country + " is: " + capital);
            }
        }
        System.out.println(this.name + ", your score is: " + score + "/" + countries.size());
        saveScore(score);
        System.out.println("Score saved to classificacio.txt");
    }

    public void saveScore(int score) {
        DocsManagement docs = new DocsManagement();
        String textLine = this.name + " your score is: " + score;
        docs.writeFile("classificacio.txt", textLine);
    }
}



