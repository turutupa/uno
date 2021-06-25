package com.uno;

public class SkipCard extends Card {
    public final Colors color;

    SkipCard(Colors color) {
        super(CardTypes.SKIP);
        this.color = color;
    }
}
