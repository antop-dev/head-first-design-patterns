package chapter01.game;

import org.junit.jupiter.api.Test;

class KnightTest {
    @Test
    void behavior() {
        Character character = new Knight();
        character.fight();
    }
}
