
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeAccessTest {

    private TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @Test
    void testGetBoardReturnsSameInstance() {
        Board board = game.getBoard();
        assertNotNull(board);
        board.place(1, 1, 'x');
        assertEquals('x', game.getBoard().getCell(1, 1));
    }

    @Test
    void testSetAndGetCurrentPlayer() {
        Player newPlayer = new Player('o');
        game.setCurrentPlayer(newPlayer);
        assertEquals('o', game.getCurrentPlayer().getMarker());
    }
}
