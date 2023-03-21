
package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {


    Player one = new Player(1, "One", 30);
    Player two = new Player(2, "Two", 5);
    Player three = new Player(3, "Three", 55);
    Player four = new Player(4, "Four", 30);


    @Test
    public void shouldFirstWin() {
        Game game = new Game();
        game.register(one);
        game.register(two);

        int expected = 1;
        int actual = game.round("One", "Two");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSecondWin() {
        Game game = new Game();
        game.register(two);
        game.register(four);

        int expected = 2;
        int actual = game.round("Two", "Four");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDraw() {
        Game game = new Game();
        game.register(one);
        game.register(four);

        int expected = 0;
        int actual = game.round("One", "Four");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondIsNotRegistered() {
        Game game = new Game();
        game.register(one);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("One", null);
        });

    }

    @Test
    public void shouldFirstIsNotRegistered() {
        Game game = new Game();

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(null, "One");
        });

    }

    @Test
    public void shouldBothIsNotRegistered() {
        Game game = new Game();

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(null, null);
        });
    }


}
