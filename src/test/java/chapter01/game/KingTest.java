package chapter01.game;

import org.junit.jupiter.api.Test;

class KingTest {
    @Test
    void behavior() {
        Character character = new King();
        character.fight();
    }
}
