package org.example;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe(){
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentPlayer;
        this.board = board;
    }
    public void start(){


    }
    private void switchCurrentPlayer(){
        if(currentPlayer == player1){
            currentPlayer = player2;
        }
        currentPlayer = player1;

    }
    private boolean hasWinner(){
        return false;

    }



}
