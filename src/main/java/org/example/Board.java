package org.example;

import java.util.Arrays;

public class Board {
    private char[][] cells;

    public Board() {
        this.cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y){
        if(x < 3 && x >= 0 && y < 3 && y >= 0){
            return cells[x][y] != 'x' && cells[x][y] != 'o';
        }
        return false;
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
            Arrays.fill(cells[i], '0');
        }
    }

    public void print(){
        System.out.println("Current Board:");
        System.out.println(cells.toString()); //Muss noch geupgradet werden
    }
}
