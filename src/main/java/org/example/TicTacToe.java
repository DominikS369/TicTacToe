package org.example;

import java.util.Scanner;

public class TicTacToe {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private Scanner scanner;

    public TicTacToe() {
        this.player1 = new Player('x');
        this.player2 = new Player('o');
        this.currentPlayer = player1;
        this.board = new Board();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        board.print();

        while (true) {
            System.out.println("Spieler "
                    + currentPlayer.getMarker()
                    + " ist am Zug (Zeile Spalte):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            board.place(row, col, currentPlayer.getMarker());
            board.print();

            if (hasWinner()) {
                System.out.println("Spieler " + currentPlayer.getMarker() + " hat gewonnen!");
                break;
            }

            if (board.isFull()) {
                System.out.println("Unentschieden!");
                break;
            }
            switchCurrentPlayer();
        }
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private boolean hasWinner() {
        char m = currentPlayer.getMarker();

        // Reihen prüfen
        for (int i = 0; i < 3; i++) {
            if (board.getCell(i, 0) == m &&
                    board.getCell(i, 1) == m &&
                    board.getCell(i, 2) == m) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board.getCell(0, j) == m &&
                    board.getCell(1, j) == m &&
                    board.getCell(2, j) == m) {
                return true;
            }
        }
        if (board.getCell(0, 0) == m &&
                board.getCell(1, 1) == m &&
                board.getCell(2, 2) == m) {
            return true;
        }
        if (board.getCell(0, 2) == m &&
                board.getCell(1, 1) == m &&
                board.getCell(2, 0) == m) {
            return true;
        }
        return false;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Board getBoard() {
        return board;
    }
}
