
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void testEmptyCellReturnsTrue() {
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void testNonEmptyCellReturnsFalse() {
        board.place(0, 0, 'x');
        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test
    void testPlaceMarker() {
        board.place(1, 1, 'o');
        assertEquals('o', board.getCell(1, 1));
    }

    @Test
    void testCantOverwriteMarker() {
        board.place(1, 1, 'x');
        board.place(1, 1, 'o');
        assertEquals('x', board.getCell(1, 1));
    }

    @Test
    void testFullBoardReturnsTrue() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board.place(i, j, 'x');
        assertTrue(board.isFull());
    }

    @Test
    void testNotFullBoardReturnsFalse() {
        board.place(0, 0, 'x');
        assertFalse(board.isFull());
    }

    @Test
    void testClearEmptiesBoard() {
        board.place(0, 0, 'x');
        board.clear();
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void testClearAfterFullBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board.place(i, j, 'x');
        board.clear();
        assertTrue(board.isCellEmpty(2, 2));
    }

    @Test
    void testGetPlacedMarker() {
        board.place(2, 2, 'o');
        assertEquals('o', board.getCell(2, 2));
    }

    @Test
    void testGetUninitializedCell() {
        assertEquals(' ', board.getCell(1, 1));
    }
}
