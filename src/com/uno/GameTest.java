package com.uno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GameTest {
    final String gameName = "This is Uno baby!";
    final int totalNumberOfNumberCards = 40;
    final int totalNumberOfDrawTwoCards = 8;
    final int totalNumberOfReverseCards = 8;
    final int totalNumberOfSkipCards = 8;
    final int totalNumberOfWildCards = 4;
    final int totalNumberOfWildDrawFourCards = 4;
    final int totalNumberOfCards = totalNumberOfNumberCards +
            totalNumberOfDrawTwoCards +
            totalNumberOfReverseCards +
            totalNumberOfSkipCards +
            totalNumberOfWildCards +
            totalNumberOfWildDrawFourCards;

    @BeforeEach
    void setUp() {

    }

    @Test
    void newGame() {
        Game game = Game.create(gameName);
        assertEquals(gameName, game.name);
    }

    @Test
    void numberCardsAdded() {
        Game game = Game.create("Alberto");
        assertEquals(game.deck.size(), totalNumberOfCards);
    }

    @Test
    void cardsAreShuffled() {
        Game gameX = Game.create("Alberto");
        Game gameY = Game.create("Another Game");
        Card firstCardX = gameX.deck.get(0);
        Card firstCardY = gameY.deck.get(0);

        Card lastCardX = gameX.deck.get(gameX.deck.size() - 1);
        Card lastCardY = gameY.deck.get(gameY.deck.size() - 1);

        // actually, they could be the same card... although
        // they probably shouldn't. Gotta re-write this test
        assertNotEquals(firstCardX, firstCardY);
        assertNotEquals(lastCardX, lastCardY);
    }

    @Test
    void addPlayer() {
        Game game = Game.create("Tournament!");
        String player = "Jaume";
        game.addPlayer(player);
        assertEquals(game.players.get(0).name, player);
    }

    @Test
    void start() {
        Game game = Game.create("Tournament baby");
        game.addPlayer("Jaume");
        game.addPlayer("Alberto");
        game.addPlayer("James");
        game.addPlayer("Yaar");
        game.start();

        for (Player player : game.players) {
            assertEquals(player.hand.size(), 7);
        }
    }
}