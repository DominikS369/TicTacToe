package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            TicTacToe game = new TicTacToe();
            game.start();

            System.out.print("Neues Spiel starten? (j/n): ");
            String antwort = scanner.nextLine().trim().toLowerCase();

            if (!antwort.equals("j")) {
                System.out.println("Auf Wiedersehen!");
                break;
            }
        }
    }
}