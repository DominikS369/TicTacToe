
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testReturnsCorrectMarker() {
        Player player = new Player('x');
        assertEquals('x', player.getMarker());
    }

    @Test
    void testMultiplePlayersDifferentMarkers() {
        Player player1 = new Player('x');
        Player player2 = new Player('o');
        assertNotEquals(player1.getMarker(), player2.getMarker());
    }
}
