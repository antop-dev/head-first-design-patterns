package chapter01.game;

import org.junit.jupiter.api.Test;

class TrollTest {

    @Test
    void behavior() {
        Character character = new Troll();
        character.fight();
    }
}
