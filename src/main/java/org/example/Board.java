package org.example;

import java.util.Arrays;

public class Board {
    private char[][] cells;

    public Board() {
        this.cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y){
        return cells[x][y] == '\0';
    }

    public void place(int x, int y, char marker){
        cells[x][y] = marker;
    }

    public boolean isFull(){
        for (int i = 0; i < cells.length; i++) {
            for (int k = 0; k < cells[i].length; k++) {
                if(isCellEmpty(i,k)){
                    return false;
                }
            }
        }
        return true;
    }

    public void clear(){
        for (int i = 0; i < cells.length; i++) {
            Arrays.fill(cells[i], '\0');
        }
    }

    public void print(){
        String lines = "-------------";
        System.out.println("Current Board:");
        System.out.println(lines);
        for (int i = 0; i < cells.length; i++) {
            System.out.print("|");
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(" " +
                        (cells[i][j] != 'x' && cells[i][j] != 'o' ? " " : cells[i][j]) + " |");
            }
            System.out.println();
            System.out.println(lines);
        }
    }
}
