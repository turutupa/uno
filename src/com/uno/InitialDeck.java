package com.uno;

import java.util.ArrayList;
import java.util.Collections;

public class InitialDeck {
    public ArrayList<Card> deck = new ArrayList<>();

    public static ArrayList<Card> create() {
        InitialDeck deck = new InitialDeck();
        deck.addNumberCardsToDeck();
        deck.addDrawTwoCardsToDeck();
        deck.addReverseCardsToDeck();
        deck.addSkipCardsToDeck();
        deck.addWildCardsToDeck();
        deck.addWildDrawFourCardsToDeck();
        return deck.deck;
    }

    public static ArrayList<Card> shuffle(ArrayList<Card> deck) {
        Collections.shuffle(deck);
        return deck;
    }

    private void addNumberCardsToDeck() {
        for (Colors color : Colors.values()) {
            for (int i = 0; i < 10; i++) {
                NumberCard card = new NumberCard(color, i);
                this.deck.add(card);
            }
        }
    }

    private void addDrawTwoCardsToDeck() {
        for (Colors color : Colors.values()) {
            DrawTwoCard cardOne = new DrawTwoCard(color);
            DrawTwoCard cardTwo = new DrawTwoCard(color);
            this.deck.add(cardOne);
            this.deck.add(cardTwo);
        }
    }

    private void addReverseCardsToDeck() {
        for (Colors color : Colors.values()) {
            ReverseCard cardOne = new ReverseCard(color);
            ReverseCard cardTwo = new ReverseCard(color);
            this.deck.add(cardOne);
            this.deck.add(cardTwo);
        }
    }

    private void addSkipCardsToDeck() {
        for (Colors color : Colors.values()) {
            SkipCard cardOne = new SkipCard(color);
            SkipCard cardTwo = new SkipCard(color);
            this.deck.add(cardOne);
            this.deck.add(cardTwo);
        }
    }

    private void addWildCardsToDeck() {
        for (int i = 0; i < 4; i++) {
            WildCard card = new WildCard();
            deck.add(card);
        }
    }

    private void addWildDrawFourCardsToDeck() {
        for (int i = 0; i < 4; i++) {
            WildDrawFourCard card = new WildDrawFourCard();
            deck.add(card);
        }
    }
}
