package Nivel1.CapitalGame;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CitiesAndCapitals game = new CitiesAndCapitals();

        game.readCities();
        game.askName(sc);
        game.play(sc);

    }
}