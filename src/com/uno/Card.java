package com.uno;

public abstract class Card {
    protected CardTypes type;

    Card(CardTypes type) {
        this.type = type;
    }
}
