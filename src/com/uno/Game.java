package com.uno;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    public String name;
    public ArrayList<Card> deck;
    public ArrayList<Player> players = new ArrayList<>();

    private Game(String name) {
        this.name = name;
    }

    public static Game create(String name) {
        Game game = new Game(name);
        ArrayList<Card> deck = InitialDeck.create();
        Collections.shuffle(deck);
        game.deck = deck;
        return game;
    }

    public void addPlayer(String name) {
        if (this.players.size() >= 10) throw new RuntimeException("Number of players exceeded");
        this.players.add(Player.named(name));
    }

    public void start() {
        this.dealCards();
    }

    private void dealCards() {
        for (Player player : this.players) {
            for (int i = 0; i < 7; i++) {
                Card card = this.deck.remove(0);
                player.hand.add(card);
            }
        }
    }
}
