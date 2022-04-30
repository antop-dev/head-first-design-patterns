package chapter01.game;

import org.junit.jupiter.api.Test;

class QueenTest {
    @Test
    void behavior() {
        Character character = new Queen();
        character.fight();
    }
}
